public class OldTelevisor<turnOnOrOffByRemoteControl> implements Televisor {
    private String name;
    private String model;
    boolean turnedOn = false;

    public OldTelevisor(String name, String model, boolean turnedOn) {
        this.name = name;
        this.model = model;
        this.turnedOn = turnedOn;

    }


    @Override
    public void turnOn() {
        if (!turnedOn) {
            System.out.println("пуск");
            System.out.println("Появилось небольшое шипение…");
            System.out.println("Засветился экран…");
            System.out.println("Телевизор name включен.");
            turnedOn=true;
        } else {
            System.out.println("телевизор name уже включен");
        }
    }

    @Override
    public void turnOff() {
        if (turnedOn) {
            System.out.println("выкл");
            turnedOn = false;
            System.out.println("Экран погас...");
        } else {
            System.out.println("телевизор уже включен");
        }
    }


    @Override
    public void turnOnOrOffByRemoteControl(RemoteControl remoteControl) {
if()
//        реализовать метод turnOnOrOffByRemoteControl, который будет принимать пульт:
//> первым шагом вызываем метод isRemoteControlEnabledToUseWithTv - описание метода ниже
//> если можно использовать, то вызывать turnOn или turnOff в зависимости от того, включен ли телевизор или нет
//- приватный метод isRemoteControlEnabledToUseWithTv(RemoteControl remoteControl) - проверяет, может ли данный пульт быть
// использован для данного телевизора (по названию и модели) - реализовать приватный метод,
// который будет возвращать true либо false, в зависимости от того, можно ли использовать данный пульт с телевизором
//  > если можно, то вызывает метод turnOn или turnOff (зависит от того, включен ли телевизор или нет)
//  > если нельзя, то выводит сообщение, что данный пульт не подходит к телевизору
//
//
// Класс NewTelevisor, использует интерфейс Televisor
// Поля private name, model, turnedOn

    }
    private void isRemoteControlEnabledToUseWithTv(RemoteControl remoteControl){

    }
}

