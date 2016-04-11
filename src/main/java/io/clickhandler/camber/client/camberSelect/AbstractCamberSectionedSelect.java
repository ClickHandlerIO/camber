package io.clickhandler.camber.client.camberSelect;

import io.clickhandler.camber.client.select2.Select2Data;
import io.clickhandler.camber.client.select2.Select2DataAdapterResponse;
import io.clickhandler.reactGwt.client.Func;
import io.clickhandler.reactGwt.client.Jso;
import io.clickhandler.reactGwt.client.react.ReactComponent;

import java.util.List;
import java.util.Map;

public abstract class AbstractCamberSectionedSelect<P extends AbstractCamberBasicSelect.CamberSelectProps<AbstractCamberSectionedSelect.ValueObject>> extends AbstractCamberBasicSelect<AbstractCamberSectionedSelect.ValueObject, P> {

    @Override
    protected void internalFetch(ReactComponent<P, State<AbstractCamberSectionedSelect.ValueObject>> $this, String search, Func.Run1<Select2DataAdapterResponse> completion) {
        fetch($this, search, (select2Datas, dataMap) -> {
            Select2DataAdapterResponse response = Jso.create();
            response.setResults(select2Datas != null ? ((Select2Data[]) select2Datas.toArray()) : null);
            completion.run(response);
            $this.setState(s -> s.setDataMap(dataMap));
        });
    }

    protected abstract void fetch(ReactComponent<P, State<ValueObject>> $this, String search, FetchCompletionHandler completionHandler);

    public interface FetchCompletionHandler {
        void onComplete(List<Select2Data> select2Datas, Map<String, ValueObject> dataMap);
    }

    @Override
    protected Select2Data translate(ValueObject value) {
        Select2Data data = Jso.create();
        data.setId(value.getId());
        data.setText(value.getText());
        return data;
    }

    public static class ValueObject {
        private String id;
        private String secondaryId;
        private String text;

        public ValueObject() {
        }

        public ValueObject(String id, String text) {
            this.id = id;
            this.text = text;
        }

        public ValueObject(String id, String secondaryId, String text) {
            this.id = id;
            this.secondaryId = secondaryId;
            this.text = text;
        }

        public String getSecondaryId() {
            return secondaryId;
        }

        public void setSecondaryId(String secondaryId) {
            this.secondaryId = secondaryId;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}
