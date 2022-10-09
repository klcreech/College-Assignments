//Name: Kerry Creech
//Assignment: Module 3
//Purpose: To send property changes to a control via boolean statements. This is done via button click ( Curtain choose)
//Last Modified: 9/19/2021

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Kerry_Creech_Module_3_Assignment
{
    public partial class Form1 : Form
    {
        bool chose;
        public Form1()
        {
            InitializeComponent();
            //Set bool to false
            chose = false;
        }        

       
        private void Form1_Load(object sender, EventArgs e)
        {  


        }

        private void Btn_CurtOne_Click(object sender, EventArgs e)
        {
            //initiate if statement to intilize bool

            if (chose)
            {
                Lbl_Disp.Text = "You only get one choice in this game!"; Lbl_Disp.Refresh();
            }
            else
            {
                Lbl_Disp.Text = "You've Won a New Turtle"; Lbl_Disp.Refresh();
                chose = true;

            }
        }

        private void Btn_CurtTwo_Click(object sender, EventArgs e)
        {
            //initiate if statement to intilize bool
            if (chose)
            {
                Lbl_Disp.Text = "You only get one choice in this game!"; Lbl_Disp.Refresh();
            }
            else
            {
                Lbl_Disp.Text = "You've Won a New Toy Car!"; Lbl_Disp.Refresh();
                chose = true;
            }
        }

        private void Btn_CurtThree_Click(object sender, EventArgs e)
        {
            //initiate if statement to intilize bool
            if (chose)
            {
                Lbl_Disp.Text = "You only get one choice in this game!"; Lbl_Disp.Refresh();
            }
            else
            {
                Lbl_Disp.Text = "You've Won a New Stick!"; Lbl_Disp.Refresh();
                chose = true;
            }
        }

        private void label1_Click(object sender, EventArgs e)
        {
            
                Console.WriteLine("Odd numbers from 1 to 99. Prints one number per line.");
                for (int n = 1; n < (99 + 1); n++)
                {
                    if (n % 2 != 0)
                    {
                        Console.WriteLine(n.ToString());
                    }
                }

           
        }
    }
}
