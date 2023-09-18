import tkinter as tk

class POOER7:
    def __init__(self, A, B):
        self.A = A
        self.B = B

    def resolver(self):

        if self.A > self.B:
            return "El primer numero es mayor"

        elif self.B > self.A:
            return "El segundo numero es mayor"

        else:
            return "Ambos numeros son iguales"
        
def inecuacion():
    A = float(A_entry.get())
    B = float(B_entry.get())

    desigualdad = POOER7(A, B)

    desigualdad_label.config(text=desigualdad.resolver())
    
root = tk.Tk()
root.title("Desigualdad")
root.geometry("300x200")

A_label = tk.Label(root, text="Primer numero:")
A_label.pack()
A_entry = tk.Entry(root)
A_entry.pack()

B_label = tk.Label(root, text="Segundo numero:")
B_label.pack()
B_entry = tk.Entry(root)
B_entry.pack()
    
calcular_button = tk.Button(root, text="Calcular", command=inecuacion, background="#D1F2EB")
calcular_button.pack()

desigualdad_label = tk.Label(root, text="")
desigualdad_label.pack()

root.mainloop()
