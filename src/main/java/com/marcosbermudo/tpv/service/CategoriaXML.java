/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marcosbermudo.tpv.service;

import com.marcosbermudo.tpv.model.Categoria;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CategoriaXML {

    private static final String FILE_PATH = "categorias.xml";

    public static void guardarCategorias(List<Categoria> categorias) {
        try {
            File file = new File(FILE_PATH);

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc;

            // Si el archivo ya existe, cargarlo; si no  crear un nuevo documento
            if (file.exists()) {
                doc = builder.parse(file);
            } else {
                doc = builder.newDocument();
                Element root = doc.createElement("categorias");
                doc.appendChild(root);
            }

            // Obtener el nodo raíz
            Element root = (Element) doc.getElementsByTagName("categorias").item(0);

            //Agregar nuevas categorías al nodo raíz
            for (Categoria nuevaCategoria : categorias) {
                Element categoriaElement = doc.createElement("categoria");
                categoriaElement.setAttribute("nombre", nuevaCategoria.getNombre());
                root.appendChild(categoriaElement);
            }

            // Guardar el documento actualizado en el archivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Categoria> cargarCategorias() {
        List<Categoria> categorias = new ArrayList<>();
        try {
            File file = new File(FILE_PATH);

            // Si el archivo no existe, retorna una lista vacía
            if (!file.exists()) {
                System.out.println("El archivo de categorías no existe. Retornando lista vacía.");
                return categorias;
            }

            // Crear el parser para leer el archivo XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);

            // Obtener todos los elementos <categoria>
            NodeList categoriaNodes = doc.getElementsByTagName("categoria");
            for (int i = 0; i < categoriaNodes.getLength(); i++) {
                Node node = categoriaNodes.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element categoriaElement = (Element) node;
                    String nombre = categoriaElement.getAttribute("nombre");

                    // Crear una instancia de la clase categoria
                    Categoria nuevaCategoria = new Categoria(nombre);

                    // Agregarla a la lista
                    categorias.add(nuevaCategoria);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return categorias;
    }

}
