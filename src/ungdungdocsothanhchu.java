import java.util.Scanner;
public class ungdungdocsothanhchu {
    public static void main(String[] args) {
        int number;
        int ones=0;
        String units="";
        String tens="";
        String read="";
        String hundred ="";
        int dozens =0;
        String readdozens ="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = scanner.nextInt();
        if (number<10&&number>=0){
            switch (number){
                case 0:
                    read = "zero";
                    break;
                case 1:
                    read ="one";
                    break;
                case 2:
                    read ="two";
                    break;
                case 3:
                    read ="three";
                    break;
                case 4:
                    read ="four";
                    break;
                case 5:
                    read ="five";
                    break;
                case 6:
                    read ="six";
                    break;
                case 7:
                    read ="seven";
                    break;
                case 8:
                    read ="eight";
                    break;
                case 9:
                    read ="nine";
                    break;
                default:
                    read ="out of ability";
                    break;
            }
        }else if (number<20&&number>=10){
            ones = number -10;
            switch (ones){
                case 1:
                    read ="eleven";
                    break;
                case 2:
                    read ="twelve";
                    break;
                case 3:
                    read ="thirteen";
                    break;
                case 4:
                    read ="fourteen";
                    break;
                case 5:
                    read ="fifteen";
                    break;
                case 6:
                    read ="sixteen";
                    break;
                case 7:
                    read ="seventeen";
                    break;
                case 8:
                    read ="eighteen";
                    break;
                case 9:
                    read ="nineteen";
                    break;
                default:
                    read ="out of ability";
                    break;
            }
        }else if (number>=20&&number<100){
            if (number>=20&&number<30){
                tens = "twenty";
                ones = number -20;
            }
            else if (number>=30&&number<40){
                tens = "thirty";
                ones = number -30;
            }
            else if (number>=40&&number<50){
                tens = "forty";
                ones = number -40;
            }
            else if (number>=50&&number<60){
                tens = "fifty";
                ones = number -50;
            }
            else if (number>=60&&number<70){
                tens = "sixty";
                ones = number -60;
            }
            else if (number>=70&&number<80){
                tens = "seventy";
                ones = number -70;
            }
            else if (number>=80&&number<90){
                tens = "eighty";
                ones = number -80;
            }else if (number>=90&&number<100){
                tens = "ninety";
                ones = number -90;
            }
            switch (ones){
                case 0:
                    units = "";
                    break;
                case 1:
                    units ="one";
                    break;
                case 2:
                    units ="two";
                    break;
                case 3:
                    units ="three";
                    break;
                case 4:
                    units ="four";
                    break;
                case 5:
                    units ="five";
                    break;
                case 6:
                    units ="six";
                    break;
                case 7:
                    units ="seven";
                    break;
                case 8:
                    units ="eight";
                    break;
                case 9:
                    units ="nine";
                    break;
            }
            read = tens + units;
        }else if (number>=100&&number<1000){
            if (number>=100&&number<200){
                hundred = "one";
                dozens = number -100;
            }
            else if (number>=200&&number<300){
                hundred = "two";
                dozens = number -200;
            }
            else if (number>=300&&number<400){
                hundred = "three";
                dozens = number -300;
            }
            else if (number>=400&&number<500){
                hundred = "four";
                dozens = number -400;
            }
            else if (number>=500&&number<600){
                hundred = "five";
                dozens = number -500;
            }
            else if (number>=600&&number<700){
                hundred = "six";
                dozens = number -600;
            }
            else if (number>=700&&number<800){
                hundred = "seven ";
                dozens = number -700;
            }else if (number>=800&&number<900){
                hundred = "eight ";
                dozens = number -800;
            } else if (number>=900&&number<1000){
                hundred = "nine ";
                dozens = number -900;
            }
            if (dozens>=20&&dozens<30){
                tens = "twenty ";
                ones = dozens -20;
            }
            else if (dozens>=30&&dozens<40){
                tens = "thirty";
                ones = dozens -30;
            }
            else if (dozens>=40&&dozens<50){
                tens = "forty";
                ones = dozens -40;
            }
            else if (dozens>=50&&dozens<60){
                tens = "fifty";
                ones = dozens -50;
            }
            else if (dozens>=60&&dozens<70){
                tens = "sixty";
                ones = dozens -60;
            }
            else if (dozens>=70&&dozens<80){
                tens = "seventy";
                ones = dozens -70;
            }
            else if (dozens>=80&&dozens<90){
                tens = "eighty";
                ones = dozens -80;
            }else if (dozens>=90&&dozens<100){
                tens = "ninety";
                ones = dozens -90;
            }
            switch (ones){
                case 0:
                    units = "";
                    break;
                case 1:
                    units ="one";
                    break;
                case 2:
                    units ="two";
                    break;
                case 3:
                    units ="three";
                    break;
                case 4:
                    units ="four";
                    break;
                case 5:
                    units ="five";
                    break;
                case 6:
                    units ="six";
                    break;
                case 7:
                    units ="seven";
                    break;
                case 8:
                    units ="eight";
                    break;
                case 9:
                    units ="nine";
                    break;
            }
            readdozens = tens + units;
            read = hundred +" hundred and " + readdozens;

        }
        System.out.printf(read);
    }
}
