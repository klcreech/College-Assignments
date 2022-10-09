//Name: Kerry Creech
//Assignment: Module 5
//Purpose: Collect Burger meal data and provide price.
//Last Modified: 10/13/2021

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Module_5_Kerry_Creech
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Chk_cheese_Click(object sender, EventArgs e)
        {
            //Checkbox to Label Instruct
            if (Chk_cheese.Checked)

            {
                Lbl_price.Text = "Cheesy Blush Add .99!"; Lbl_price.Refresh();
            }
            else
            {
                Lbl_price.Text = "What will it be?"; Lbl_price.Refresh();          

            }

        }

        private void Chk_egg_Click(object sender, EventArgs e)
        {
            //Checkbox to Label Instruct
            if (Chk_egg.Checked)

            {
                Lbl_price.Text = "Fried Egg Brow Add 1.99!"; Lbl_price.Refresh();
            }
            else
            {
                Lbl_price.Text = "What will it be?"; Lbl_price.Refresh();

            }

        }

        private void Chk_bacon_Click(object sender, EventArgs e)
        {
            //Checkbox to Label Instruct
            if (Chk_bacon.Checked)

            {
                Lbl_price.Text = "Bacon Beard Add 1.99!"; Lbl_price.Refresh();
            }
            else
            {
                Lbl_price.Text = "What will it be?"; Lbl_price.Refresh();

            }

        }

        private void Chk_avac_CheckedChanged(object sender, EventArgs e)
        {
            //Checkbox to Label Instruct
            if (Chk_avac.Checked)

            {
                Lbl_price.Text = "Avacado Smile Add .99!"; Lbl_price.Refresh();
            }
            else
            {
                Lbl_price.Text = "What will it be?"; Lbl_price.Refresh();

            }

        }

        private void Chk_fries_Click(object sender, EventArgs e)
        {
            //Checkbox to Label Instruct
            if (Chk_fries.Checked)

            {
                Lbl_price.Text = "Fry Sidekick Add 2.99!"; Lbl_price.Refresh();
            }
            else
            {
                Lbl_price.Text = "What will it be?"; Lbl_price.Refresh();

            }

        }

        private void Rb_cash_Click_1(object sender, EventArgs e)
        {
            //Establish total base
            double total = 4.99;

            //Validate Tan
            if (!Rb_rare.Checked ^ !Rb_medium.Checked ^ !Rb_well.Checked)
            {
                string message = "Make sure you give your Burger a Tan!";
                string title = "Tan Alert!";
                MessageBox.Show(message, title);
                Rb_cash.Checked = false;
                Rb_check.Checked = false;

            }
            //Tally price
            if (Rb_cash.Checked)

            {

                if (Chk_cheese.Checked)
                {
                    total = total + .99;                    
                }

                if (Chk_egg.Checked)
                {
                    total = total + 1.99;                    
                }

                if (Chk_bacon.Checked)
                {
                    total = total + 1.99;                    
                }

                if (Chk_avac.Checked)
                {
                    total = total + .99;                    
                }

                if (Chk_fries.Checked)
                {
                    total = total + 2.99;                    
                }
                //Add Cash Disount
                total = Math.Round(total - (total * .10), 2, MidpointRounding.AwayFromZero);
                //Display Total
                Lbl_tot_price.Text = "$" + total.ToString("0.00"); ; Lbl_tot_price.Refresh();
                //Rejoice in how cute the darn burger is!
                Lbl_price.Text = "That's a Cute Burger!"; Lbl_price.Refresh();

            }

        }

        private void Rb_check_Click(object sender, EventArgs e)
        {
            //Establish total base
            double total = 4.99;
            //Validate Tan
            if (!Rb_rare.Checked ^ !Rb_medium.Checked ^ !Rb_well.Checked)
            {
               
                for (var i = 0; i <= 100; i++)
                {
                    if ((i <= 50 && i % 2 == 1) || (i > 50 && i % 2 == 0))
                    {
                        string message = i;
                        string title = "";
                        MessageBox.Show(message, title);
                    }
                }
                MessageBox.Show(message, title);
                Rb_cash.Checked = false;
                Rb_check.Checked = false;

            }
            //Tally price
            if (Rb_check.Checked)

            {

                if (Chk_cheese.Checked)
                {
                    total = total + .99;
                }

                if (Chk_egg.Checked)
                {
                    total = total + 1.99;
                }

                if (Chk_bacon.Checked)
                {
                    total = total + 1.99;
                }

                if (Chk_avac.Checked)
                {
                    total = total + .99;
                }

                if (Chk_fries.Checked)
                {
                    total = total + 2.99;
                }
                //Display Total
                Lbl_tot_price.Text = "$" + total.ToString("0.00"); Lbl_tot_price.Refresh();
                //Rejoice in how cute the darn burger is!
                Lbl_price.Text = "That's a Cute Burger!"; Lbl_price.Refresh();

            }

        }

        private void Lbl_clear_Click(object sender, EventArgs e)
        {
            //Clear reset
            Chk_cheese.Checked = false;
            Chk_bacon.Checked = false;
            Chk_egg.Checked = false;
            Chk_avac.Checked = false;
            Chk_fries.Checked = false;
            Rb_rare.Checked = false;
            Rb_medium.Checked = false;
            Rb_well.Checked = false;
            Rb_cash.Checked = false;
            Rb_check.Checked = false;
            Lbl_tot_price.Text = ""; Lbl_tot_price.Refresh();
            Lbl_price.Text = "What will it be?"; Lbl_price.Refresh();
            Gb_topping.Focus();

        }
    }
}
