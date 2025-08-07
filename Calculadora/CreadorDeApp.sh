#!/bin/bash

# Ruta donde se instalará el lanzador
DESTINO="/usr/share/applications"

# Nombre del lanzador (sin espacios ni caracteres raros)
NOMBRE_LANZADOR="calculadora-java.desktop"

# Ruta completa del archivo .desktop
ARCHIVO="$DESTINO/$NOMBRE_LANZADOR"

# Crear el archivo .desktop
cat > "$ARCHIVO" << EOF
[Desktop Entry]
Type=Application
Name=Calculadora Java
Exec=java -cp /home/Yulmio/Programas/Calculo-master/Calculadora Calculadora
Icon=accessories-calculator
Terminal=false
Categories=Utility;
EOF

# Establecer permisos adecuados
chmod 644 "$ARCHIVO"

echo "Lanzador creado correctamente en: $ARCHIVO"
