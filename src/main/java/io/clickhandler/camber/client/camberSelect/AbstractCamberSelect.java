package io.clickhandler.camber.client.camberSelect;

import io.clickhandler.camber.client.select2.Select2Data;
import io.clickhandler.camber.client.select2.Select2DataAdapterResponse;
import io.clickhandler.reactGwt.client.Func;
import io.clickhandler.reactGwt.client.Jso;
import io.clickhandler.reactGwt.client.react.ReactComponent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractCamberSelect<VALUE, P extends AbstractCamberSelect.CamberSelectProps<VALUE>> extends AbstractCamberBasicSelect<VALUE, P> {
    @Override
    protected void internalFetch(ReactComponent<P, State<VALUE>> $this, String search, Func.Run1<Select2DataAdapterResponse> completion) {
        fetch($this, search, data -> {
            List<Select2Data> select2Datas = new ArrayList<>();
            Map<String, VALUE> dataMap = new HashMap<>();
            if (data != null) {
                for (VALUE val : data) {
                    Select2Data itm = translate(val);
                    select2Datas.add(itm);
                    dataMap.put(itm.getId(), val);
                }
            }
            Select2DataAdapterResponse response = Jso.create();
            response.setResults(((Select2Data[]) select2Datas.toArray()));
            completion.run(response);
            $this.setState(s -> s.setDataMap(dataMap));
        });
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Abstract Methods
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    protected abstract void fetch(ReactComponent<P, State<VALUE>> $this, String search, FetchCompletionHandler<VALUE> completionHandler);

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    public interface FetchCompletionHandler<V> {
        void onComplete(List<V> data);
    }
}
