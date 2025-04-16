# Tasca-S1.07.-Anotaciones

Este proyecto contiene un conjunto de ejercicios prácticos diseñados para poner en práctica los conceptos de anotaciones personalizadas, herencia y uso de las mejores prácticas de programación orientada a objetos en Java.

## 📖 Descripción

El objetivo principal de este proyecto es crear una jerarquía de clases y trabajar con anotaciones estándar y personalizadas. Además, se implementa la funcionalidad de serialización mediante anotaciones personalizadas y la demostración de su uso con reflección en Java.

### **Ejercicios**:

#### **Nivel 1**
1. **Ejercicio 1**  
   Se implementa una jerarquía de clases con `Trabajador`, `TrabajadorOnline` y `TrabajadorPresencial`. Cada una tiene implementaciones específicas del método `calcularSou()`:
   - `Trabajador`: Calcula el sueldo multiplicando las horas trabajadas por el precio por hora.
   - `TrabajadorOnline`: Calcula el sueldo considerando una tarifa plana de Internet.
   - `TrabajadorPresencial`: Calcula el sueldo agregando un costo de gasolina. Este último valor es un atributo estático.

   Todas las clases hacen uso de la anotación `@Override` para sobreescribir el método `calcularSou()`, y el funcionamiento es demostrado desde el `main()` de una clase principal.

2. **Ejercicio 2**  
   Se incluyen métodos obsoletos utilizando la anotación `@Deprecated`. Los métodos obsoletos se invocan desde una clase externa, donde se utilizan las anotaciones necesarias para suprimir las advertencias de obsolescencia.

#### **Nivel 2**
1. **Ejercicio 1**  
   Se crea una anotación personalizada para serializar objetos Java en archivos JSON. La anotación personalizada recibe como parámetro el directorio de destino donde se guardará el archivo resultante.

#### **Nivel 3**
1. **Ejercicio 1**  
   Se amplía la funcionalidad de la anotación personalizada creada en el nivel anterior para que pueda ser registrada por la JVM en tiempo de ejecución. Utilizando Java Reflection, se muestra cómo leer y usar la anotación en tiempo de ejecución.

---

## 💻 Tecnologías Utilizadas

- **Lenguaje**: Java 20 o superior
- **Entorno de Desarrollo**: IntelliJ IDEA / Eclipse
- **Serialización JSON**: Jackson (u otra librería de serialización, como Gson)
- **Maven**: Para la gestión de dependencias y el ciclo de vida del proyecto (opcional)
- **JUnit 5**: Para pruebas automatizadas (opcional)

---

## 📋 Requisitos

Para ejecutar este proyecto necesitas tener instalado:

- **Java Development Kit (JDK)** versión 20 o superior.
- Un IDE como IntelliJ IDEA o Eclipse.
- Opcional: Maven o Gradle para la configuración y gestión de dependencias.

---

## 🛠️ Instalación

1. Clona el repositorio desde GitHub:

   ```bash
   git clone https://github.com/Pablo2203/Tasca-S1.07.-Anotaciones.git
   ```

2. Abre el proyecto en tu IDE preferido (IntelliJ IDEA o Eclipse).

3. Si estás utilizando Maven:
   - Ejecuta el comando `mvn install` para descargar las dependencias necesarias.
   - Asegúrate de que el archivo `pom.xml` está correctamente configurado.

4. Si estás utilizando Gradle:  
   - Ejecuta el comando `gradle build`.

---

## ▶️ Ejecución

Para ejecutar el proyecto, sigue estos pasos:

1. Asegúrate de que el entorno de desarrollo está correctamente configurado.
2. Dirígete al archivo `Principal.java` dentro del paquete principal.
3. Ejecuta el método `main()` desde tu IDE.
4. Observa los resultados en la consola.

---

## 🌐 Despliegue

Este proyecto no está diseñado para su despliegue en producción. Sin embargo, puedes compilarlo como un archivo `.jar` siguiendo estos pasos:

1. Asegúrate de que el proyecto no tenga errores.
2. Usa Maven o Gradle para compilar un archivo ejecutable `.jar`:
   ```bash
   mvn package
   ```
3. Ejecuta el archivo `.jar` con:
   ```bash
   java -jar nombre-del-archivo.jar
   ```

---

## 🤝 Contribuciones

Si deseas contribuir a este proyecto:

1. Realiza un fork del repositorio.
2. Crea una rama con tu funcionalidad:
   ```bash
   git checkout -b feature/nombre-de-tu-funcionalidad
   ```
3. Realiza un commit de tus cambios:
   ```bash
   git commit -m "Descripción de los cambios realizados"
   ```
4. Haz un push a tu rama:
   ```bash
   git push origin feature/nombre-de-tu-funcionalidad
   ```
5. Abre un **pull request** en el repositorio original explicando los cambios.

---

## 📄 Licencia

Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.
