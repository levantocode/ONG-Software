from tkinter import *

class Login:

    def __init__(self, master):
        #Window
        self.frameTop = Frame(master)
        self.frameBot = Frame(master)

        self.frameTop.pack(side=TOP)
        self.frameBot.pack(side=BOTTOM)



        #Menu
        self.menuTop = Menu(master)
        master.config(menu=self.menuTop)

        self.ddlM_Ajuda = Menu(self.menuTop)
        self.menuTop.add_cascade(label='Ajuda', menu=self.ddlM_Ajuda)



        #Widgets
        self.lblLogin    = Label(self.frameTop, text='Login', font=('bold', 15), height=2)

        self.lblUsername = Label(self.frameBot, text='Username')
        self.lblPassword = Label(self.frameBot, text='Password')

        self.etrUsername = Entry(self.frameBot)
        self.etrPassword = Entry(self.frameBot)

        self.chkRemember = Checkbutton(self.frameBot, text='Stay logged in')

        self.btnLogin    = Button(self.frameBot, text='Log in')
        self.btnQuit     = Button(self.frameBot, text='Quit')
   


        #Positioning Widgets
        self.lblLogin.grid(row=0)

        self.lblUsername.grid(row=1, sticky=W)
        self.etrUsername.grid(row=1, column=1)

        self.lblPassword.grid(row=2, sticky=W)
        self.etrPassword.grid(row=2, column=1)

        self.chkRemember.grid(row=3, columnspan=2, sticky=W)

        self.btnLogin.grid(row=4, sticky=W)
        self.btnQuit.grid(row=4, column=1, sticky=E)







