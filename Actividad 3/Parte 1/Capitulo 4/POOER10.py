import tkinter as tk

class POOER10:
    def __init__(self, numero_inscripcion, nombre, patrimonio, estrato):
        self.numero_inscripcion = numero_inscripcion
        self.nombre = nombre
        self.patrimonio = patrimonio
        self.estrato = estrato
    
    def matricula(self):
        self.valor_matricula = 50_000

        if self.patrimonio > 2_000_000 and self.estrato > 3:
            self.valor_matricula += 0.03 * self.patrimonio 
        
        return self.valor_matricula
    

def calcular_matricula():
    numero_inscripcion = int(numero_inscripcion_entry.get())
    nombre = nombre_entry.get()
    patrimonio = float(patrimonio_entry.get())
    estrato = int(estrato_entry.get())

    estudiante = POOER10(numero_inscripcion, nombre, patrimonio, estrato)

    valor_matricula_label.config(text=f"Valor a pagar: {estudiante.raices():.3f}")

root = tk.Tk()
root.title("Formulario estudiante")
root.geometry("300x300")

numero_inscripcion_label = tk.Label(root, text="Numero de inscripcion:")
numero_inscripcion_label.pack()
numero_inscripcion_entry = tk.Entry(root)
numero_inscripcion_entry.pack()
        
nombre_label = tk.Label(root, text="Nombre:")
nombre_label.pack()
nombre_entry = tk.Entry(root)
nombre_entry.pack()

patrimonio_label = tk.Label(root, text="Patrimonio:")
patrimonio_label.pack()
patrimonio_entry = tk.Entry(root)
patrimonio_entry.pack()

estrato_label = tk.Label(root, text="Estrato:")
estrato_label.pack()
estrato_entry = tk.Entry(root)
estrato_entry.pack()

calcular_button = tk.Button(root, text="Calcular", command=calcular_matricula, background="#D1F2EB")
calcular_button.pack()

valor_matricula_label = tk.Label(root, text="")
valor_matricula_label.pack()

root.mainloop() 