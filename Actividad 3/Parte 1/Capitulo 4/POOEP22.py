import tkinter as tk

class POOEP22:
    def __init__(self, nombre, valor_hora, numero_horas):
        self.nombre = nombre
        self.valor_hora = valor_hora
        self.numero_horas = numero_horas
    
    def func(self):
        self.salario = self.numero_horas * self.valor_hora

        if self.salario > 450_000:
            return "El salario es: " + str(self.salario)
        
        else:
            return "El salario no es mayor de 450000"
        

def comprobar():
    nombre = nombre_entry.get()
    valor_hora = float(valor_hora_entry.get())
    numero_horas = float(numero_horas_entry.get())

    empleado = POOEP22(nombre, valor_hora, numero_horas)

    salario_label.config(text=empleado.func())
        
root = tk.Tk()
root.title("Desigualdad")
root.geometry("300x200")

nombre_label = tk.Label(root, text="Nombre:")
nombre_label.pack()
nombre_entry = tk.Entry(root)
nombre_entry.pack()

valor_hora_label = tk.Label(root, text="Valor por hora:")
valor_hora_label.pack()
valor_hora_entry = tk.Entry(root)
valor_hora_entry.pack()

numero_horas_label = tk.Label(root, text="Numero de horas:")
numero_horas_label.pack()
numero_horas_entry = tk.Entry(root)
numero_horas_entry.pack()
    
calcular_button = tk.Button(root, text="Calcular", command=comprobar, background="#D1F2EB")
calcular_button.pack()

salario_label = tk.Label(root, text="")
salario_label.pack()

root.mainloop()
