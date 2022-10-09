//Name: Kerry Creech
//Assignment: Module 4
//Purpose: To calculate two numbers and throw exceptions if found.
//Last Modified: 9/29/2021

using System;
using System.Windows.Forms;

namespace Module_4_HW


{
    public partial class Form1 : Form
    {

        // Declare Variables
        String ans2;
        int num1;
        int num2;
        int ans1;
        float dnum1;
        float dnum2;
        float dans1;
        float con;
        int parsedValue;

        public Form1()
        {
            InitializeComponent();
        }


        private void Form1_Load(object sender, EventArgs e)
        {


        }


        private void Btn_Add_Click(object sender, EventArgs e)
        {

            try
            {
                //Parse textbox to integer
                num1 = int.Parse(Txt_Num1.Text);
                num2 = int.Parse(Txt_Num2.Text);

                // Calcuate
                ans1 = num1 + num2;

                // Convert Answer to String
                ans2 = ans1.ToString();

                // Display in Label
                Lbl_Result.Text = ans2; Lbl_Result.Refresh();
            }


            catch (Exception)
            {
                if (Txt_Num1.Text == "" | Txt_Num2.Text == "")
                {

                    string message = "You must have digits in both fields before I can calculate!";
                    string title = "Empty Field Exception";
                    MessageBox.Show(message, title);
                }

                else if (!int.TryParse(Txt_Num1.Text, out parsedValue) | !int.TryParse(Txt_Num2.Text, out parsedValue))
                {

                    string message = "Use whole numbers only!";
                    string title = "Digits Only Exception";
                    MessageBox.Show(message, title);
                }


            }





        }

        private void Btn_Subtract_Click(object sender, EventArgs e)
        {

            try
            {
                //Parse textbox to integer
                num1 = int.Parse(Txt_Num1.Text);
                num2 = int.Parse(Txt_Num2.Text);

                // Calcuate
                ans1 = num1 - num2;

                // Convert Answer to String
                ans2 = ans1.ToString();

                // Display in Label
                Lbl_Result.Text = ans2; Lbl_Result.Refresh();
            }


            catch (Exception)
            {
                if (Txt_Num1.Text == "" | Txt_Num2.Text == "")
                {

                    string message = "You must have digits in both fields before I can calculate!";
                    string title = "Empty Field Exception";
                    MessageBox.Show(message, title);
                }

                else if (!int.TryParse(Txt_Num1.Text, out parsedValue) | !int.TryParse(Txt_Num2.Text, out parsedValue))
                {

                    string message = "Use whole numbers only!";
                    string title = "Digits Only Exception";
                    MessageBox.Show(message, title);
                }


            }

        }

        private void Btn_Multiply_Click(object sender, EventArgs e)
        {

            try
            {
                //Parse textbox to integer
                num1 = int.Parse(Txt_Num1.Text);
                num2 = int.Parse(Txt_Num2.Text);

                // Calcuate
                ans1 = num1 * num2;

                // Convert Answer to String
                ans2 = ans1.ToString();

                // Display in Label
                Lbl_Result.Text = ans2; Lbl_Result.Refresh();
            }


            catch (Exception)
            {
                if (Txt_Num1.Text == "" | Txt_Num2.Text == "")
                {

                    string message = "You must have digits in both fields before I can calculate!";
                    string title = "Empty Field Exception";
                    MessageBox.Show(message, title);
                }

                else if (!int.TryParse(Txt_Num1.Text, out parsedValue) | !int.TryParse(Txt_Num2.Text, out parsedValue))
                {

                    string message = "Use whole numbers only!";
                    string title = "Digits Only Exception";
                    MessageBox.Show(message, title);
                }


            }

        }

        private void Btn_Divide_Click(object sender, EventArgs e)
        {

            try
            {
                //Parse textbox to integer
                dnum1 = float.Parse(Txt_Num1.Text);
                dnum2 = float.Parse(Txt_Num2.Text);

                // Calcuate and format to 2 decimal places
                dans1 = dnum1 / dnum2;
                con = (float)System.Math.Round(dans1, 2);

                // Convert Answer to String
                ans2 = con.ToString();

                // Display in Label
                Lbl_Result.Text = ans2; Lbl_Result.Refresh();
            }


            catch (Exception)
            {
                if (Txt_Num1.Text == "" | Txt_Num2.Text == "")
                {

                    string message = "You must have digits in both fields before I can calculate!";
                    string title = "Empty Field Exception";
                    MessageBox.Show(message, title);
                }

                else if (!int.TryParse(Txt_Num1.Text, out parsedValue) | !int.TryParse(Txt_Num2.Text, out parsedValue))
                {

                    string message = "Use whole numbers only!";
                    string title = "Digits Only Exception";
                    MessageBox.Show(message, title);
                }


            }
        }
    }
}
