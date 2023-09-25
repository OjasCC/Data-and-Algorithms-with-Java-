class PassByvalue{
    public static void main(String args[]){
         int x = 5;
         changer(x);
         System.out.println(x);
    }
    static void changer(int variableToBeChanged){
      variableToBeChanged=10;
    }
}