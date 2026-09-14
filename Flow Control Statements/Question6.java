public class Question6 {
    public static void main(String[] args) {
        int cp=100 , sp=50, profit, loss,profit_in_percentage,loss_in_percentage;
        if(cp<sp){
            profit = sp-cp;
            profit_in_percentage = (profit*100)/cp;
            System.out.println(profit_in_percentage+"% Profit in percentage");
        } 
        else if(cp>sp){
            loss = sp-cp;
            loss_in_percentage = (loss*100)/cp;
            System.out.println(loss_in_percentage+"% Loss in percentage");
        }
        else{
            System.out.println("No profit No loss");
        }
    }
}
