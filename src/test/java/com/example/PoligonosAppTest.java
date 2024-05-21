package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Testes unitários para a classe {@link PoligonosApp},
 * que verifica se os métodos da classe estão funcionando corretamente.
 * Você não deve alterar este arquivo.
 */
class PoligonosAppTest {
    private final PoligonosApp app = new PoligonosApp();

    @Test
    void perimetros() {
        assertThat(app.perimetros()).isEqualTo(List.of(300, 450, 222, 270, 310));
    }

    @Test
    void tipoPoligonos() {
        final var resultList = app.tipoPoligonos().stream().map(String::toLowerCase).map(String::trim).toList();
        assertThat(resultList).isEqualTo(List.of("quadrilátero", "quadrilátero", "triângulo", "pentágono", "hexágono"));
    }
}