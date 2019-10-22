package plugin.zozidalom.calculator;

import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import plugin.zozidalom.calculator.handlers.CalculateQuadricEquationHandler;
import plugin.zozidalom.calculator.handlers.CustomLaunchRequestHander;

public class CalculatorStreamHandler extends SkillStreamHandler {
    public CalculatorStreamHandler() {
        super(Skills.standard()
                .addRequestHandler(new CustomLaunchRequestHander())
                .addRequestHandler(new CalculateQuadricEquationHandler())
                .build());
    }
}
