# 🌐 Implementación de L3VPN sobre SRv6 (Servicio End.DT46) con VyOS

![Topología SRv6](images/topologia.png)
*(Nota: Asegúrate de subir la imagen de tu topología a una carpeta `images/` en el repo y actualizar este enlace)*

## 📋 Descripción del Proyecto
Este repositorio contiene la configuración y topología de un laboratorio de enrutamiento avanzado desplegado con **Containerlab**. El objetivo principal es simular el núcleo de un Proveedor de Servicios de Internet (ISP) utilizando enrutamiento por segmentos sobre IPv6 (**SRv6**) para proveer servicios de VPN de Capa 3 (L3VPN) mediante el comportamiento **End.DT46**.

## 🛠️ Tecnologías y Protocolos Implementados
* **Orquestación:** Containerlab, Docker.
* **Nodos de Red:** VyOS 1.5 (Rolling Release), Linux genérico para CEs/Hosts.
* **Underlay Network:** IS-IS (Level-2) para enrutamiento interno IPv6.
* **Overlay Network:** MP-BGP (eBGP para los CE, iBGP en el core) con soporte de Address Family VPNv4/VPNv6.
* **Traffic Engineering:** Segment Routing IPv6 (SRv6) con locators L3VPN.
* [cite_start]**Aislamiento:** VRFs para segmentación de clientes (Tabla 101)[cite: 6].

---

## 🔬 Validación y Pruebas (Troubleshooting)

### 1. Verificación del Plano de Control (End.DT46)
[cite_start]El router PE asigna correctamente el SID con el comportamiento `uDT46` para desencapsular el tráfico y buscar el destino IPv4 directamente en la tabla de enrutamiento de la VRF del cliente (Tabla 101)[cite: 6].
* [cite_start]Las rutas se inyectan exitosamente en el kernel de Linux dentro de las instancias VRF1[cite: 8].
* [cite_start]Comprobación de conectividad mediante tablas IPv4 e IPv6[cite: 9, 10].

### 2. Análisis del Plano de Datos (Wireshark)
[cite_start]Se realizó una captura de tráfico en el backbone (entre P1 y PE2)[cite: 5]. [cite_start]La captura evidencia la correcta encapsulación de los paquetes ICMP de IPv4 dentro de una cabecera IPv6[cite: 5].
* [cite_start]**Destination Address:** `2001:db8:2:aaa:65::` (SID asignado por PE1)[cite: 5].

### [cite_start]3. Pruebas de Conectividad Extremo a Extremo [cite: 2]
El enrutamiento a través del túnel SRv6 es completamente funcional entre los extremos de los clientes (CE1 y CE2).
* [cite_start]Trazabilidad limpia verificada mediante **MTR** entre las redes LAN (`192.168.10.0/24` a `192.168.20.0/24`)[cite: 3].
* [cite_start]RTT estable (promedio < 0.5ms) validado mediante ICMP **Ping**[cite: 4].

### [cite_start]4. Pruebas de Rendimiento (Throughput) [cite: 11]
Se inyectó tráfico sintético para validar la capacidad del túnel sin fragmentación ni desbordamiento de búfer.
* [cite_start]**Herramienta:** `iperf3` (Protocolo UDP)[cite: 12].
* [cite_start]**Parámetros:** Ancho de banda objetivo de 10 Mbps durante 60 segundos (`-b 10M -t 60`)[cite: 12].
* [cite_start]**Resultado:** Transferencia exitosa con **0% de pérdida de datagramas** y **0.000 ms de Jitter**, confirmando la estabilidad de la encapsulación bajo carga[cite: 12].

---

## 🚀 Cómo desplegar este laboratorio

1. Clonar el repositorio:
   ```bash
   git clone [https://github.com/Jhon1176/TU_REPOSITORIO.git](https://github.com/Jhon1176/TU_REPOSITORIO.git)
   cd TU_REPOSITORIO
