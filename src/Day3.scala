object Day3 {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var N = sc.nextInt();

    if(N%2==1) {
      println("Weird");
    } else if(N%2==0) {

      if(2<=N && N<=5)
        println("Not Weird");
      else if(6<=N && N<=20)
        println("Weird");
      else
        println("Not Weird");
    }
  }

}
