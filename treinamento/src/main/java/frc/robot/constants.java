package frc.robot;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.ClosedLoopConfig.FeedbackSensor;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import java.security.PublicKey;

import javax.lang.model.util.ElementScanner14;
import javax.xml.stream.events.StartDocument;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkClosedLoopController;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public final class constants {
    //Crio uma classe para cada id de motor
    //public static tipo nomeVariavel = valor;
    
    public static class ControlesDriversID {
        public static int Joystick1 = 5;
        public static int Joystick2 = 6;
    }

    public static class TracaoMotoresID {
        public static int MotorDireitaFrente = 1;
        public static int MotorDireitaTras = 2;
        public static int MotorEsquerdaFrente = 3;
        public static int MotorEsquerdatras = 4;
    }

    public static class CoralMotorID {
        public static int MotorCoral = 7;       
    }

    public static class ClimberMotorID {
        public static int MotorClimber = 8;
    }

    public static class AlgaMotorID{
        public static int MotorAlga = 9;
    }
    //Criando as classes enumk
    //Criação das constantes que definem os status dos mecanismos

    public static enum TracaoVelocidades{
        PARADO(0.0), MOVIMENTANDO(0.20), CLIMBANDO(-0.20);
        public final double velocidades;

        private TracaoVelocidades(double velocidades){
            this.velocidades = velocidades;
        }
    }
    //Criando a classe enum
    public static enum CoralVelocidades{
        PARADO(0.0), MID(0.6), FULL(0.92);
        public final double velocidades;

        //Criando o método que irá selecionar algum dos valores definidos; Esse método tem que ser privado
        private CoralVelocidades(double velocidades){
            this.velocidades = velocidades;
        }
        
    }
}