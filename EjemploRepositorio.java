package org.angel.interfaces;

import org.angel.interfaces.modelo.Cliente;
import org.angel.interfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        CompletoRepositorio repositorio = new ClienteListRepositorio();
        repositorio.crear(new Cliente("Angel", "Puch"));
        repositorio.crear(new Cliente("Bea", "Gonzales"));
        repositorio.crear(new Cliente("Pedro", "Garcia"));
        repositorio.crear(new Cliente("Cesar", "Perez"));

        List<Cliente> clientes = repositorio.listar();
        clientes.forEach(System.out::println);

        System.out.println();
        System.out.println("----- Paginable -----");
        List<Cliente> paginable = repositorio.listar(1, 3);
        paginable.forEach(System.out::println);

        System.out.println();
        System.out.println("----- Ordenar -----");
        List<Cliente> ordenable = repositorio.listar("nombre", Direccion.DESCENDENTE);
        ordenable.forEach(System.out::println);

        System.out.println();
        System.out.println("----- Editar -----");
        Cliente angelActualizar = new Cliente("Angel", "Hernandez");
        angelActualizar.setId(1);
        repositorio.editar(angelActualizar);
        System.out.println(repositorio.getporId(1));

        System.out.println();
        System.out.println("----- Total -----");
        System.out.println("Numero de registros: " + repositorio.total());
    }
}
