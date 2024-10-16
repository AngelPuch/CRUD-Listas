package org.angel.interfaces.repositorio;

import org.angel.interfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion direccion);
}
