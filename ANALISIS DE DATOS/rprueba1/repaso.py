import numpy as np

array = np.array([[10, 20, 30],
                  [40, 50, 60],
                  [70, 80, 90]])

print(array)
print(f"Promedio de toda la matiz: {np.mean(array)}")
print(f"Promedio por columnas: {np.mean(array,axis=0)}")
print(f"Promedio por filas: {np.mean(array,axis=1)}")