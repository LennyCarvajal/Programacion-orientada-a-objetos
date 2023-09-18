import tkinter as tk

class POOEP23:
    def __init__(self, A, B, C):
        self.A = A
        self.B = B
        self.C = C

    def raices(self):
        self.X1 = (-self.B - (self.B**2 - 4 * self.A * self.C)**0.5) / 2 * self.A
        self.X2 = (-self.B + (self.B**2 - 4 * self.A * self.C)**0.5) / 2 * self.A
        return [self.X1, self.X2]
    

def calcular_raices():
    A = float(A_entry.get())
    B = float(B_entry.get())
    C = float(C_entry.get())

    ecuacion = POOEP23(A, B, C)

    X1_label.config(text=f"Primera raiz: {ecuacion.raices()[0]:.3f}")
    X2_label.config(text=f"Segunda raiz: {ecuacion.raices()[1]:.3f}")

root = tk.Tk()
root.title("Cuadratica")
root.geometry("300x200")

A_label = tk.Label(root, text="Coeficiente A:")
A_label.pack()
A_entry = tk.Entry(root)
A_entry.pack()

B_label = tk.Label(root, text="Coeficiente B:")
B_label.pack()
B_entry = tk.Entry(root)
B_entry.pack()

C_label = tk.Label(root, text="Coeficiente C:")
C_label.pack()
C_entry = tk.Entry(root)
C_entry.pack()


calcular_button = tk.Button(root, text="Calcular", command=calcular_raices, background="#D1F2EB")
calcular_button.pack()

X1_label = tk.Label(root, text="")
X1_label.pack()

X2_label = tk.Label(root, text="")
X2_label.pack()

root.mainloop()