package Calculadora_projeto;


public class TesteIntegracao {
    
    /*
    *No meu projeto não é possível realizar testes de integração
    *então pra realizar esses testes usei o escopo de uma clínica médica
    */
    
    //Teste para adicionar paciente no sistema
    Log.log("Adicionando um paciente no sistema...");
    PacienteRN paciente = new PacienteRNImpl();
    paciente.inclui( DadosPaciente.getED());
    
    Log.log("Paciente incluído com sucesso: "+DadosPaciente.getED().getNomePac());
    
    
    //Teste para realizar uma consulta pelo paciente no sistema
    Log.log("Consultando um paciente no sistema...");
    PacienteED pacienteED = paciente.consulta(DadosPaciente.getED());
    
    Assert.assertEquals(pacienteED.getNomePac(), .getED().getNomePac());
    
    Log.log("Paciente consultado com sucesso: "+DadosPaciente.getED().getNomePac());
    
    
    //Teste para exclusão de paciente do sistema
    Log.log("Exclindo o paciente do sistema...");
    
    paciente.exclui(DadosPaciente.getED());
    
    Log.logLast("Paciente excluído com sucesso: "+DadosPaciente.getED().getNomePac());
}
