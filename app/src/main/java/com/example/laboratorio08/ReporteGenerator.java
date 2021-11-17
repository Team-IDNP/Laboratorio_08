package com.example.laboratorio08;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class ReporteGenerator {

    private static final String[] departamentos = {
            "Amazonas",
            "Ancash",
            "Apurimac",
            "Arequipa",
            "Ayacucho",
            "Cajamarca",
            "Callao",
            "Cusco",
            "Huancavelica",
            "Huanuco",
            "Ica",
            "Junín",
            "La Libertad",
            "Lambayeque",
            "Lima",
            "Loreto",
            "Madre de Dios",
            "Moquegua",
            "Pasco",
            "Piura",
            "Puno",
            "San Martín",
            "Tacna",
            "Tumbes",
            "Ucayali",
    };
    private static final String[] provincias = {
            "Huaraz",
            "Aija",
            "Antonio Raimondi",
            "Asunción",
            "Bolognesi",
            "Carhuaz",
            "Carlos Fermín",
            "Casma",
            "Corongo",
            "Huari",
            "Huarmey",
            "Huaylas",
            "Mariscal Luzuriaga",
            "Ocros",
            "Pallasca",
            "Pomabamba",
            "Recuay",
            "Santa",
            "Sihuas",
            "Yungay"
    };
    private static final String[] distritos = {
            "EL PORVENIR",
            "LA ESPERANZA",
            "HUANCHACO",
            "VIRU",
            "VICTOR LARCO HERRERA",
            "HUAMACHUCO",
            "CHEPEN",
            "GUADALUPE",
            "FLORENCIA DE MORA",
            "CHAO",
            "LAREDO",
            "MOCHE",
            "CASA GRANDE",
            "PACASMAYO",
            "USQUIL",
            "OTUZCO",
            "PAIJAN",
            "PACANGA",
            "PARCOY",
            "SANTIAGO DE CHUCO",
            "SANTIAGO DE CAO",
            "CHUGAY",
            "SALAVERRY",
            "MARCABAL",
            "SAN PEDRO DE LLOC",
            "CHICAMA",
            "SANAGORAN",
            "PUEBLO NUEVO",
            "TAYABAMBA",
            "QUIRUVILCA",
            "CASCAS",
            "SARTIMBAMBA",
            "CHILLIA",
            "SAN JOSE",
            "JULCAN",
            "SARIN",
            "AGALLPAMPA",
            "GUADALUPITO",
            "CHOCOPE",
            "COCHORCO",
            "RAZURI",
            "PATAZ",
            "SINSICAP",
            "CURGOS",
            "CACHICADAN",
            "SAYAPULLO",
            "ANGASMARCA",
            "HUASO",
            "LUCMA",
            "ASCOPE",
            "CARABAMBA",
            "HUANCASPATA",
            "SALPO",
            "CALAMARCA",
            "HUARANCHAL",
            "BOLIVAR",
            "HUAYO",
            "SIMBAL",
            "BAMBAMARCA",
            "JEQUETEPEQUE",
            "BULDIBUYO",
            "HUAYLILLAS",
            "SITABAMBA",
            "MAGDALENA DE CAO",
            "POROTO",
            "SANTA CRUZ DE CHUCA",
            "MACHE",
            "TAURIJA",
            "CHARAT",
            "URPAY",
            "UCHUMARCA",
            "MOLLEPATA",
            "SANTIAGO DE CHALLAS",
            "MOLLEBAMBA",
            "LONGOTEA",
            "MARMOT",
            "CONDORMARCA",
            "ONGON",
            "PIAS",
            "UCUNCHA",
            "PARANDAY",
            "LA CUESTA"
    };

    private static String elementoAleatorio(@NonNull String[] arr) {
        int tamano = arr.length;
        int posicion = (int) (Math.random() * tamano);
        return arr[posicion];
    }

    public static List<Reporte> generar(int cantidad) {
        List<Reporte> lista = new ArrayList<>(cantidad);
        for (int i = 0; i < cantidad; i++) {
            lista.add(new Reporte(
                    elementoAleatorio(departamentos),
                    elementoAleatorio(provincias),
                    elementoAleatorio(distritos),
                    true,
                    ""
            ));
        }
        return lista;
    }

}
