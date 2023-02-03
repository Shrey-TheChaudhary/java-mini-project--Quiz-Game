//Project Name: MCQ Quiz

// ArrayList-> Questions,OPt1,OPt2,OPt3,OPt1,correctoption
// min: 10 questions[java]
// -----
// Start Test
// instructions

// Are you aready to start?(Yes/No)
// -> Yes

// 1. Question no 1
// A. option1
// B. option2
// C. option3
// D. option4
// Choose correct option: A

// 2. Question no 2
// A. option1
// B. option2
// C. option3
// D. option4
// Choose correct option: C

// 3,4,5,6,7,8,9,10

// Your Result
// ====================================================
// Marks                Percentage
// ----------------------------------------------------
// 10 out of 10         60%
// ----------------------------------------------------



import java.io.*;
import java.util.*;
class miniproject
{
public static void main(String[] args) {

ArrayList<String> ques = new ArrayList<String>();
ques.add("Which is Cleanest City of India?");
ques.add("Who is The Railway Minister Of India?");
ques.add("Who is CEO of LensKart?");
ques.add("Which of the following is not a operating system?");
ques.add("Which is Andhra Pradesh's new capital?");
ques.add("Where is Statue of Unity situated?");
ques.add("Who is the chief guest in India on 26th january 2023?");
ques.add("Which is Rajasthan ony hill station?");
ques.add("Who launched CHATGPT?");
ques.add("Which movie made history by scoring a nomination in the Best Original Song category at the upcoming Oscars");

ArrayList<String> opt = new ArrayList<String>();
opt.add("Surat-Indore-Pune-Panji");
opt.add("Nirmala Sitharaman-Piyush Goyal-Jyotiraditya Scindia-Ashwini Vaishnaw");
opt.add("Ayaan Ali-Aman Gupta-Peyush Bansal-Alagh Ghazal");
opt.add("Windows-BharOS-Linux-Hypervisor");
opt.add("Visakhapatnam-Hyderabad-Anantapur-Vijayawada");
opt.add("Gujarat-Rajasthan-Goa-Tamil Nadu");
opt.add("AbdelFattah el Sisi-Mohammed bin Zayed Al Nahyan-William Ruto-Ebrahim Raisi");
opt.add("Jaipur-Mount Abu-Jodhpur-Ranthambore");
opt.add("Microsoft-Google- OpenAI -None of These");
opt.add("Pathaan-Kantara-Dhamaka-RRR");

ArrayList<Integer> ans = new ArrayList<Integer>();
ans.add(2);
ans.add(2);
ans.add(3);
ans.add(4);
ans.add(1);
ans.add(1);
ans.add(1);
ans.add(2);
ans.add(3);
ans.add(4);

int count=0;
System.out.println("START");
System.out.println("Are you ready to start?(Yes/No)");
Scanner sc = new Scanner(System.in); 
String Choice=sc.nextLine();
if(Choice.equalsIgnoreCase("yes")==false) 
{
    System.out.println("thanks for visiting...Come Again Soon");
    return;
}

else
{
    for(int i=0;i<ques.size();i++)
    { 
        String str[]=opt.get(i).split("-");
         List<String> al = new ArrayList<String>();
    al = Arrays.asList(str);
        System.out.println("Question "+(i+1)+":"+ques.get(i));
        System.out.println("option 1: "+al.get(0));
        System.out.println("option 2: "+al.get(1));
        System.out.println("option 3: "+al.get(2));
        System.out.println("option 4: "+al.get(3));

        System.out.println("choose your option");
        int userchoice=sc.nextInt();

        if(userchoice==ans.get(i))
        count++;

    }
    
}
System.out.println("Your Result");
System.out.println("===========================================================");
System.out.println(count+"/"+ques.size());
System.out.println("Your Accuracy");
System.out.println("===========================================================");
System.out.println((count*100)/ques.size()+"%");




}
}
