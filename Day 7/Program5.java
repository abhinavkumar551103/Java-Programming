class Program5{
	public static void main(String[] args){
	if(args[0].equals("1234")){
	System.out.println("Validation Fails ??");
	System.exit(0);
}
	System.out.println("Program Starts");
	System.out.println("Array length is: "+args.length);
	for(String n:args){
	System.out.println(n);
	}
	System.out.println("Program Ends");

     }
}

