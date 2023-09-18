import tkinter as tk
import math

class Circulo:
    def __init__(self, radio):
        self.radio = radio

    def calc_area(self):
        return math.pi * self.radio**2
    
    def calc_perimetro(self):
        return 2 * math.pi * self.radio
    
def interfaz_circulo():
    def calcular_circulo():
        radio = float(radio_entry.get())

        circulo = Circulo(radio)

        perimetro_label.config(text=f"Perimetro: {circulo.calc_perimetro():.3f}")
        area_label.config(text=f"Area: {circulo.calc_area():.3f}")

    ventana_circulo = tk.Toplevel(root)
    ventana_circulo.title("Circulo")
    ventana_circulo.geometry("160x125")

    radio_label = tk.Label(ventana_circulo, text="Radio:")
    radio_label.pack()
    radio_entry = tk.Entry(ventana_circulo)
    radio_entry.pack()

    calcular_button = tk.Button(ventana_circulo, text="Calcular", command=calcular_circulo, background="#D1F2EB")
    calcular_button.pack()

    perimetro_label = tk.Label(ventana_circulo, text="")
    perimetro_label.pack()

    area_label = tk.Label(ventana_circulo, text="")
    area_label.pack()



class Cuadrado:
    def __init__(self, lado):
        self.lado = lado

    def calc_area(self):
        return self.lado**2

    def calc_perimetro(self):
        return self.lado * 4
    
def interfaz_cuadrado():
    def calcular_cuadrado():
        lado = float(lado_entry.get())

        cuadrado = Cuadrado(lado)

        perimetro_label.config(text=f"Perimetro: {cuadrado.calc_perimetro():.3f}")
        area_label.config(text=f"Area: {cuadrado.calc_area():.3f}")

    ventana_cuadrado = tk.Toplevel(root)
    ventana_cuadrado.title("Cuadrado")
    ventana_cuadrado.geometry("160x125")

    lado_label = tk.Label(ventana_cuadrado, text="Lado:")
    lado_label.pack()
    lado_entry = tk.Entry(ventana_cuadrado)
    lado_entry.pack()

    calcular_button = tk.Button(ventana_cuadrado, text="Calcular", command=calcular_cuadrado, background="#D1F2EB")
    calcular_button.pack()

    perimetro_label = tk.Label(ventana_cuadrado, text="")
    perimetro_label.pack()

    area_label = tk.Label(ventana_cuadrado, text="")
    area_label.pack()

    

class Rectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def calc_area(self):
        return self.altura * self.base 
    
    def calc_perimetro(self):
        return 2 * (self.altura + self.base)
    
def interfaz_rectangulo():
    def calcular_rectangulo():
        base = float(base_entry.get())
        altura = float(altura_entry.get())

        rectangulo = Rectangulo(base, altura)

        perimetro_label.config(text=f"Perimetro: {rectangulo.calc_perimetro():.3f}")
        area_label.config(text=f"Area: {rectangulo.calc_area():.3f}")

    ventana_rectangulo = tk.Toplevel(root)
    ventana_rectangulo.title("Rectangulo")
    ventana_rectangulo.geometry("160x175")

    base_label = tk.Label(ventana_rectangulo, text="Base:")
    base_label.pack()
    base_entry = tk.Entry(ventana_rectangulo)
    base_entry.pack()

    altura_label = tk.Label(ventana_rectangulo, text="Altura:")
    altura_label.pack()
    altura_entry = tk.Entry(ventana_rectangulo)
    altura_entry.pack()

    calcular_button = tk.Button(ventana_rectangulo, text="Calcular", command=calcular_rectangulo, background="#D1F2EB")
    calcular_button.pack()

    perimetro_label = tk.Label(ventana_rectangulo, text="")
    perimetro_label.pack()

    area_label = tk.Label(ventana_rectangulo, text="")
    area_label.pack()
    


class TrianguloRectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def calc_area(self): 
        return self.base * self.altura / 2

    def calc_hipotenusa(self): 
        return (self.base**2 + self.altura**2)**0.5

    def calc_perimetro(self): 
        return (self.base + self.altura + self.calc_hipotenusa()); 

    def tipo_triangulo(self):

        if ((self.base == self.altura) and (self.base == self.calc_hipotenusa()) and (self.altura == self.calc_hipotenusa())): 
            return "Equilátero"
        elif (self.base != self.altura) and (self.base != self.calc_hipotenusa()) and (self.altura != self.calc_hipotenusa()): 
            return "Escaleno"
        else: 
            return "Isósceles" 

def interfaz_triangulo():
    def calcular_triangulo():
        base = float(base_entry.get())
        altura = float(altura_entry.get())

        triangulo = TrianguloRectangulo(base, altura)

        area_label.config(text=f"Area: {triangulo.calc_area():.3f}")
        hipotenusa_label.config(text=f"Hipotenusa: {triangulo.calc_hipotenusa():.3f}")
        perimetro_label.config(text=f"Perimetro: {triangulo.calc_perimetro():.3f}")
        tipo_triangulo_label.config(text=triangulo.tipo_triangulo())

    ventana_triangulo = tk.Toplevel(root)
    ventana_triangulo.title("Triangulo Rectangulo")
    ventana_triangulo.geometry("160x225")

    base_label = tk.Label(ventana_triangulo, text="Base:")
    base_label.pack()
    base_entry = tk.Entry(ventana_triangulo)
    base_entry.pack()

    altura_label = tk.Label(ventana_triangulo, text="Altura:")
    altura_label.pack()
    altura_entry = tk.Entry(ventana_triangulo)
    altura_entry.pack()

    calcular_button = tk.Button(ventana_triangulo, text="Calcular", command=calcular_triangulo, background="#D1F2EB")
    calcular_button.pack()

    perimetro_label = tk.Label(ventana_triangulo, text="")
    perimetro_label.pack()

    hipotenusa_label = tk.Label(ventana_triangulo, text="")
    hipotenusa_label.pack()

    area_label = tk.Label(ventana_triangulo, text="")
    area_label.pack()

    tipo_triangulo_label = tk.Label(ventana_triangulo, text="")
    tipo_triangulo_label.pack()



root = tk.Tk()
root.title("Figuras Geométricas")
root.geometry("175x140")

button_circulo = tk.Button(root, text="Circulo", command=interfaz_circulo)
button_circulo.pack()

button_cuadrado = tk.Button(root, text="Cuadrado", command=interfaz_cuadrado)
button_cuadrado.pack()

button_rectangulo = tk.Button(root, text="Rectangulo", command=interfaz_rectangulo)
button_rectangulo.pack()

button_triangulo = tk.Button(root, text="Triangulo", command=interfaz_triangulo)
button_triangulo.pack()

root.mainloop()