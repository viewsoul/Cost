package ru.masterhole.cost;

/**
 * Автор: Павел "hole" Фетисов
 * Дата создания: 15.11.2016.
 */
public class Ekran {

    public static void cost() {

        int H = getHeight();
        int B = getDepth();
        int L = getLength();
        int perfo = getPerfo();
        double cost;

        cost = makeCost(L, H, perfo);
        cost = cost + getCostSides(getLeft(),getRight(),H,perfo);

        if (B > 200 & B <= 250 ){
            double x =  cost*0.2;
            cost = cost + x;
            System.out.println("Наценка за глубину "+x);
        } else if (B>250) {
            cost = 0;
            System.out.println("Предел глубины 250");
        }

        // вырезы
        cost = cost + Cost.getCostVirez()*getVirez();
        // Упоры
        cost = cost + Cost.getCostUpor()*getUpor();
        // грунтовка
        cost = cost + Cost.getCostGruntovka(cost);
        // цвет
        cost = cost + Cost.getCostColor(cost,getS());
        // доп работы
        cost = cost + Cost.getCostDoprab(cost);

        // упаковка

        // наценка
        cost = cost + Cost.getCostNacenka(cost);

        Cost.setCost(cost);
    }

    /**
     * @return возвращет площадь открытого экрана в метрах квадратных
     * необходимо для рассчёта стоимости цвета
     */
    private static double getS() {
        return (getLength()*(getHeight()+getDepth()))/1000000;
    }

    private static int getUpor() {
        int upor;
        upor = Integer.parseInt(""+ItemsInput.comboBoxInput.get("Упоры").getSelectedItem());
        return upor;
    }

    private static int getVirez() {
        int virez;
        virez = Integer.parseInt(""+ItemsInput.comboBoxInput.get("Вырезы").getSelectedItem());
        return virez;
    }

    private static int getPerfo() {
        return ItemsInput.comboBoxInput.get("Перфорация").getSelectedIndex();
    }

    private static int getDepth() {
        int B;
        try {
            B = Integer.parseInt(ItemsInput.textFieldInput.get("Глубина").getText());
        } catch (NumberFormatException e) {
            B = 0;
        }
        return B;
    }

    private static int getHeight() {
        int H;
        try {
            H = Integer.parseInt(ItemsInput.textFieldInput.get("Высота").getText());
        } catch (NumberFormatException e) {
            H = 0;
        }
        return H;
    }

    private static int getLength() {
        int L;
        try {
            L = Integer.parseInt(ItemsInput.textFieldInput.get("Длина").getText());
        } catch (NumberFormatException e) {
            L = 0;
        }
        return L;
    }

    private static int getLeft(){
        int left;
        left = ItemsInput.comboBoxInput.get("Бок левый").getSelectedIndex();
        return left;
    }

    private static int getRight(){
        int right;
        right = ItemsInput.comboBoxInput.get("Бок правый").getSelectedIndex();
        return right;
    }

    private static double makeCost(double L, double H, int perfo) {
        // длина в метрах
        double Lm = L/1000;
        double cost = 0;

        if (H<=0) {
            cost = 0;
//            System.out.println("Высота меньше или равна 0.");
        } else if (H > 0 & H < 450) {

            if (perfo == 0) {
                // Круг
                cost = 1520* Lm;
            } else if (perfo == 1) {
                // Квадрат 5-8
                cost = 1520* Lm;
            } else if (perfo == 2) {
                // Квадрат 3-5
                cost = 1670* Lm;
            } else if (perfo == 3) {
                // Цветок
                cost = 1720* Lm;
            }

        } else if (H >= 450 & H < 650) {

            if (perfo == 0) {
                // Круг
                cost = 1940* Lm;
            } else if (perfo == 1) {
                // Квадрат 5-8
                cost = 1940* Lm;
            } else if (perfo == 2) {
                // Квадрат 3-5
                cost = 2120* Lm;
            } else if (perfo == 3) {
                // Цветок
                cost = 2200* Lm;
            }

        } else if (H >= 650 & H <= 800){

            if (perfo == 0) {
                // Круг
                cost = 2290* Lm;
            } else if (perfo == 1) {
                // Квадрат 5-8
                cost = 2290* Lm;
            } else if (perfo == 2) {
                // Квадрат 3-5
                cost = 2510* Lm;
            } else if (perfo == 3) {
                // Цветок
                cost = 2600* Lm;
            }

        } else if (H > 800){
            cost = 0;
//            System.out.println("Высота больше 800 мм.");
        }

        return cost;
    }

    private static double getCostSides(int left, int right, int height, int perfo) {

        double cost = 0;

        if (left == 0 & right == 0) {

            // открытый

        } else if (left == 0 & right == 1) {

            // право перфорированный
            if (height > 0 & height < 450) {


                if (perfo == 0) {
                    // Круг
                    cost = 300;
                } else if (perfo == 1) {
                    // Квадрат 5-8
                    cost = 300;
                } else if (perfo == 2) {
                    // Квадрат 3-5
                    cost = 310;
                } else if (perfo == 3) {
                    // Цветок
                    cost = 320;
                }
                // право перфорированный
            } else if (height >= 450 & height < 650) {

                if (perfo == 0) {
                    // Круг
                    cost = 390;
                } else if (perfo == 1) {
                    // Квадрат 5-8
                    cost = 390;
                } else if (perfo == 2) {
                    // Квадрат 3-5
                    cost = 410;
                } else if (perfo == 3) {
                    // Цветок
                    cost = 420;
                }

                // право перфорированный
            } else if (height >= 650 & height < 800) {

                if (perfo == 0) {
                    // Круг
                    cost = 450;
                } else if (perfo == 1) {
                    // Квадрат 5-8
                    cost = 450;
                } else if (perfo == 2) {
                    // Квадрат 3-5
                    cost = 480;
                } else if (perfo == 3) {
                    // Цветок
                    cost = 490;
                }
            }

        } else if (left == 0 & right == 2) {

            // право глухой
            if (height > 0 & height < 450) {

                cost = 250;

                // право глухой
            } else if (height >= 450 & height < 650) {

                cost = 310;

                // право глухой
            } else if (height >= 650 & height < 800) {

                cost = 350;

            }

        } else if (left == 1 & right == 0) {

            // лево перфорированный
            if (height > 0 & height < 450) {

                if (perfo == 0) {
                    // Круг
                    cost = 300;
                } else if (perfo == 1) {
                    // Квадрат 5-8
                    cost = 300;
                } else if (perfo == 2) {
                    // Квадрат 3-5
                    cost = 310;
                } else if (perfo == 3) {
                    // Цветок
                    cost = 320;
                }

                // лево перфорированный
            } else if (height >= 450 & height < 650) {

                if (perfo == 0) {
                    // Круг
                    cost = 390;
                } else if (perfo == 1) {
                    // Квадрат 5-8
                    cost = 390;
                } else if (perfo == 2) {
                    // Квадрат 3-5
                    cost = 410;
                } else if (perfo == 3) {
                    // Цветок
                    cost = 420;
                }

                // лево перфорированный
            } else if (height >= 650 & height < 800) {

                if (perfo == 0) {
                    // Круг
                    cost = 450;
                } else if (perfo == 1) {
                    // Квадрат 5-8
                    cost = 450;
                } else if (perfo == 2) {
                    // Квадрат 3-5
                    cost = 480;
                } else if (perfo == 3) {
                    // Цветок
                    cost = 490;
                }
            }

        } else if (left == 1 & right == 1) {

            // с 2-х перфорированный
            if (height > 0 & height < 450) {

                if (perfo == 0) {
                    // Круг
                    cost = 530;
                } else if (perfo == 1) {
                    // Квадрат 5-8
                    cost = 530;
                } else if (perfo == 2) {
                    // Квадрат 3-5
                    cost = 560;
                } else if (perfo == 3) {
                    // Цветок
                    cost = 580;
                }

                // с 2-х перфорированный
            } else if (height >= 450 & height < 650) {

                if (perfo == 0) {
                    // Круг
                    cost = 690;
                } else if (perfo == 1) {
                    // Квадрат 5-8
                    cost = 690;
                } else if (perfo == 2) {
                    // Квадрат 3-5
                    cost = 740;
                } else if (perfo == 3) {
                    // Цветок
                    cost = 770;
                }

                // с 2-х перфорированный
            } else if (height >= 650 & height < 800) {

                if (perfo == 0) {
                    // Круг
                    cost = 790;
                } else if (perfo == 1) {
                    // Квадрат 5-8
                    cost = 790;
                } else if (perfo == 2) {
                    // Квадрат 3-5
                    cost = 860;
                } else if (perfo == 3) {
                    // Цветок
                    cost = 890;
                }

            }

        } else if (left == 1 & right == 2) {

            // c 2-х прав глух лев перф
            if (height > 0 & height < 450) {

                if (perfo == 0) {
                    // Круг
                    cost = 550;
                } else if (perfo == 1) {
                    // Квадрат 5-8
                    cost = 550;
                } else if (perfo == 2) {
                    // Квадрат 3-5
                    cost = 560;
                } else if (perfo == 3) {
                    // Цветок
                    cost = 570;
                }

                // c 2-х прав глух лев перф
            } else if (height >= 450 & height < 650) {

                if (perfo == 0) {
                    // Круг
                    cost = 700;
                } else if (perfo == 1) {
                    // Квадрат 5-8
                    cost = 700;
                } else if (perfo == 2) {
                    // Квадрат 3-5
                    cost = 720;
                } else if (perfo == 3) {
                    // Цветок
                    cost = 730;
                }

                // c 2-х прав глух лев перф
            } else if (height >= 650 & height < 800) {

                if (perfo == 0) {
                    // Круг
                    cost = 800;
                } else if (perfo == 1) {
                    // Квадрат 5-8
                    cost = 800;
                } else if (perfo == 2) {
                    // Квадрат 3-5
                    cost = 830;
                } else if (perfo == 3) {
                    // Цветок
                    cost = 840;
                }
            }

        } else if (left == 2 & right == 0) {

            // лев глухой
            if (height > 0 & height < 450) {

                cost = 250;

                // лев глухой
            } else if (height >= 450 & height < 650) {

                cost = 310;

                // лев глухой
            } else if (height >= 650 & height < 800) {

                cost = 350;

            }

        } else if (left == 2 & right == 1) {

            // с 2-х лев глух прав перф
            if (height > 0 & height < 450) {

                if (perfo == 0) {
                    // Круг
                    cost = 550;
                } else if (perfo == 1) {
                    // Квадрат 5-8
                    cost = 550;
                } else if (perfo == 2) {
                    // Квадрат 3-5
                    cost = 560;
                } else if (perfo == 3) {
                    // Цветок
                    cost = 570;
                }

                // с 2-х лев глух прав перф
            } else if (height >= 450 & height < 650) {

                if (perfo == 0) {
                    // Круг
                    cost = 700;
                } else if (perfo == 1) {
                    // Квадрат 5-8
                    cost = 700;
                } else if (perfo == 2) {
                    // Квадрат 3-5
                    cost = 720;
                } else if (perfo == 3) {
                    // Цветок
                    cost = 730;
                }

                // с 2-х лев глух прав перф
            } else if (height >= 650 & height < 800) {

                if (perfo == 0) {
                    // Круг
                    cost = 800;
                } else if (perfo == 1) {
                    // Квадрат 5-8
                    cost = 800;
                } else if (perfo == 2) {
                    // Квадрат 3-5
                    cost = 830;
                } else if (perfo == 3) {
                    // Цветок
                    cost = 840;
                }
            }

        } else if (left == 2 & right == 2) {

            // с 2-х глух
            if (height > 0 & height < 450) {

                cost = 480;

                // с 2-х глух
            } else if (height >= 450 & height < 650) {

                cost = 600;

                // с 2-х глух
            } else if (height >= 650 & height < 800) {

                cost = 480;

            }
        }

        return cost;
    }
}
