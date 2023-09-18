import tkinter as tk

class POOEP18: 
    def __init__(self, codigo, nombre, horas_mes, valor_hora, retencion):
        self.codigo = codigo
        self.nombre = nombre
        self.horas_mes = horas_mes
        self.valor_hora = valor_hora
        self.retencion = retencion

    def salario_bruto(self):
        return self.horas_mes * self.valor_hora
    
    def salario_neto(self):
        return (self.horas_mes * self.valor_hora) - self.retencion * (self.horas_mes * self.valor_hora)

def calcular_salario():
    codigo = int(codigo_entry.get())
    nombre = nombre_entry.get()
    horas_mes = float(horas_mes_entry.get())
    valor_hora = float(valor_hora_entry.get())
    retencion = float(retencion_entry.get()) / 100
    
    empleado = POOEP18(codigo, nombre, horas_mes, valor_hora, retencion)
    
    salario_bruto_label.config(text=f"Salario Bruto: {empleado.salario_bruto():.3f}")
    salario_neto_label.config(text=f"Salario Neto: {empleado.salario_neto():.3f}")


root = tk.Tk()
root.title("Formulario empleado")
root.geometry("200x300")


codigo_label = tk.Label(root, text="Codigo:")
codigo_label.pack()
codigo_entry = tk.Entry(root)
codigo_entry.pack()

nombre_label = tk.Label(root, text="Nombre:")
nombre_label.pack()
nombre_entry = tk.Entry(root)
nombre_entry.pack()

horas_mes_label = tk.Label(root, text="Horas por mes:")
horas_mes_label.pack()
horas_mes_entry = tk.Entry(root)
horas_mes_entry.pack()

valor_hora_label = tk.Label(root, text="Valor por hora:")
valor_hora_label.pack()
valor_hora_entry = tk.Entry(root)
valor_hora_entry.pack()

retencion_label = tk.Label(root, text="Retención (%):")
retencion_label.pack()
retencion_entry = tk.Entry(root)
retencion_entry.pack()

calcular_button = tk.Button(root, text="Calcular Salario", command=calcular_salario, background="#D1F2EB")
calcular_button.pack()

salario_bruto_label = tk.Label(root, text="")
salario_bruto_label.pack()

salario_neto_label = tk.Label(root, text="")
salario_neto_label.pack()

root.mainloop()
