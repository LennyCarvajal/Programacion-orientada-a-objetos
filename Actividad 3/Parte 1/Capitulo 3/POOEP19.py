import tkinter as tk

class POOEP19:
    def __init__(self, lado):
        self.lado = lado

    def calc_perimetro(self):
        return self.lado * 3

    def calc_altura(self):
        return (self.lado * 3**0.2) / 2

    def calc_area(self):
        return (self.lado**2 * 3**0.5) / 4
    

def calcular_triangulo_equilatero():
    lado = float(lado_entry.get())

    triangulo = POOEP19(lado)
    
    perimetro_label.config(text=f"Perimetro: {triangulo.calc_perimetro():.3f}")
    altura_label.config(text=f"Altura: {triangulo.calc_altura():.3f}")
    area_label.config(text=f"Area: {triangulo.calc_area():.3f}")


root = tk.Tk()
root.title("Triangulo equilatero")
root.geometry("200x150")

lado_label = tk.Label(root, text="Lado:")
lado_label.pack()
lado_entry = tk.Entry(root)
lado_entry.pack()

calcular_button = tk.Button(root, text="Calcular", command=calcular_triangulo_equilatero, background="#D1F2EB")
calcular_button.pack()

perimetro_label = tk.Label(root, text="")
perimetro_label.pack()

altura_label = tk.Label(root, text="")
altura_label.pack()

area_label = tk.Label(root, text="")
area_label.pack()

root.mainloop()
