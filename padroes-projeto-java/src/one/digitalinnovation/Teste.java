package one.digitalinnovation;

import one.digitalinnovation.facade.Facade;
import one.digitalinnovation.singleton.SingletonEager;
import one.digitalinnovation.singleton.SingletonLazy;
import one.digitalinnovation.singleton.SingletonLazyHolder;
import one.digitalinnovation.strategy.Comportamento;
import one.digitalinnovation.strategy.ComportamentoAgressivo;
import one.digitalinnovation.strategy.ComportamentoDefensivo;
import one.digitalinnovation.strategy.ComportamentoNormal;
import one.digitalinnovation.strategy.Robo;

public class Teste {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);


        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        
        
        // Strategy
        
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        
        Robo robo = new Robo();
        robo.setComportamento(normal); 
        robo.mover();
        robo.mover();
        
        robo.setComportamento(agressivo); 
        robo.mover();
        
        robo.setComportamento(defensivo); 
        robo.mover();
        
        
        // facade
        
        Facade facade = new Facade();
        facade.migrarCliente("Daniel", "14020290");
        
        

	}

}
