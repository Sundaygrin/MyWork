public class cTrade {
    #include<Trade\Trade.mqh>

    //Create an instance of CTrade
    CTrade trade;

    void OnTick()
    {
        //We create a string for the signal
        string signal ="";

        //We calculate the Ask price
        double Ask=NormalizeDouble(SymbolInfoDouble(_Symbol,SYMBOL_ASK),_Digits);

        //We calculate the Bid price
        double Bid=NormalizeDouble(SymbolInfoDouble(_Symbol,SYMBOL_BID),_Digits);

        //We create an arral for the k-line and the D-line
        double KArray[];
        double DArray[];

        //sort the array from the current candle downwards
        ArraySetAsSeries(KArray,true);
        ArraySetAsSeries(DArray,true);

        //Defined EA, current candle,3 candles, save the result
        int StochasticDefinition=iStochastic(_Symbol,_Period,5,2,2,MODE_SMA,STO_LOWHIGH);

        //We fill the array with the price data
        CopyBuffer(StochasticDefinition,0,0,3,KArray);
        CopyBuffer(StochasticDefinition,1,0,3,DArray);

        //We calculate the value for the current candle
        double KValue0=KArray[0];
        double DValue0=DArray[0];

        //We calculate the vakue for the last candle
        double KValue1=KArray[1];
        double DValue1=DArray[1];

        //If the K value has crossed the D value from above
        if ((KValue0<DValue0) && (KValue1>DValue1))
        {
            signal="sell";
        }
        //if the Kvalue has crossed the Dvalue from below
        if (KValue0>KValue1)
        {
            signal="buy";
        }

        //sell 20 Microlot
        if (signal =="sell" && PositionsTotal()<1)
            trade.Sell(0.20,NULL,Bid,0,0,NULL);

        if(signal=="buy")
            //close all open sell positions
            CloseAllSellPositions();
    }

    void CloseAllSellPositions()
    {

        //Count down until there are no positions left
        for(int i=PositionsTotal()-1;i>=0;i--)// go through all positions
        {
            //get the ticket number for the current position
            int ticket=PositionGetTicket(i);

            //get the direction of the position
            int PositionDirection=PositionGetInteger(POSITION_TYPE);

            //if it is a sell position
            if(PositionDirection==POSITION_TYPE_SELL)

                //close the current position
                trade.PositionClose(ticket);
        }//end for the loop
    }//end for the function
}
