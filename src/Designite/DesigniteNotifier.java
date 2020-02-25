package Designite;


import java.util.List;
import java.util.Map;
import Designite.smells.models.ImplementationCodeSmell;
import Designite.SourceModel.SM_Method;
public interface DesigniteNotifier {

	public void getSmellsJCity(Map<SM_Method, List<ImplementationCodeSmell>> smellMap );
}
