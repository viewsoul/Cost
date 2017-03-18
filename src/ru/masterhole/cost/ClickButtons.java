package ru.masterhole.cost;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 09.11.2016.
 */
public class ClickButtons implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        // устанавливаем скролл на самый верх
        Panels.panelInputScroll.getVerticalScrollBar().setValue(0);

        // ищем на какую кнопку нажали
        for (Buttons buttons : Buttons.values()){

            // если кнопка нашлась
            if (buttons.getButton().hashCode()==e.getSource().hashCode()){

                // переключаемся по ключу и выполняем действие
                switch (buttons) {
                    case EKRAN:
                        ItemsInput.setVisibleEkran();
                        break;
                    case RESH_PERFO:
                        ButtonsController.setVisibleReshetkiPerfo();
                        break;
                    case RESH_PERFO_VSTR:
                        ItemsInput.setVisibleReshetkiPerfoVr();
                        break;
                    case RESH_PERFO_NAKL:
                        ItemsInput.setVisibleReshetkiPerfoNakl();
                        break;
                    case RESH_PERFO_PL:
                        ItemsInput.setVisibleReshetkiPerfoPl();
                        break;
                    case RESH_PERFO_PL_SPOD:
                        ItemsInput.setVisibleReshetkiPerfoPlspod();
                        break;
                    case RESH_PERFO_VIPKL:
                        ItemsInput.setVisibleReshetkiPerfoVipukl();
                        break;
                    case HATCH:
                        ButtonsController.setVisibleHatch();
                        break;
                    case HATCH_VSTR:
                        ItemsInput.setVisibleHatchVr();
                        break;
                    case HATCH_NAKL:
                        ItemsInput.setVisibleHatchNakl();
                        break;
                    case KOROB:
                        ButtonsController.setVisibleKorob();
                        break;
                    case KOROB_G:
                        ItemsInput.setVisibleKorobG();
                        break;
                    case KOROB_P:
                        ItemsInput.setVisibleKorobP();
                        break;
                    case RESH_ZALUZ:
                        ButtonsController.setVisibleReshetkiZaluz();
                        break;
                    case RESH_ZALUZ_VSTR:
                        ItemsInput.setVisibleReshetkiZaluzVr();
                        break;
                    case RESH_ZALUZ_NAKL:
                        ItemsInput.setVisibleReshetkiZaluzNakl();
                        break;
                    case HATCH_PERFO:
                        ButtonsController.setVisibleHatchPerfo();
                        break;
                    case HATCH_PERFO_VSTR:
                        ItemsInput.setVisibleHatchPerfoVr();
                        break;
                    case HATCH_PERFO_NAKL:
                        ItemsInput.setVisibleHatchPerfoNakl();
                        break;
                }

                break;
            }
        }

        MainFrame.frame.revalidate();

    }
}
