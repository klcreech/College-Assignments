using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Chp_2_HW
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void addBtn_Click(object sender, EventArgs e)
        {
            string message = "You clicked the Add button!";
            string title = "Calculator";
            MessageBox.Show(message, title);
        }

        private void subBtn_Click(object sender, EventArgs e)
        {
            string message = "You clicked the Subtract button!";
            string title = "Calculator";
            MessageBox.Show(message, title);
        }

        private void multBtn_Click(object sender, EventArgs e)
        {
            string message = "You clicked the Multiply button!";
            string title = "Calculator";
            MessageBox.Show(message, title);
        }

        private void divBtn_Click(object sender, EventArgs e)
        {
            string message = "You clicked the Division button!";
            string title = "Calculator";
            MessageBox.Show(message, title);
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            for (var i = 0; i <= 100; i++)
            {
                if ((i <= 50 && i % 2 == 1) || (i > 50 && i % 2 == 0))
                {
                    console.log(i);
                }
            }
        }
    }
}
