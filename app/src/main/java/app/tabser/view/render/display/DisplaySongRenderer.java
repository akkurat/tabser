package app.tabser.view.render.display;

import android.graphics.Canvas;
import android.graphics.Paint;

import app.tabser.view.render.AbstractSongRenderer;
import app.tabser.view.render.Sheet;
import app.tabser.view.render.SongRenderer;
import app.tabser.view.viewmodel.RenderModel;

public class DisplaySongRenderer extends AbstractSongRenderer implements SongRenderer {

    private final DisplaySheet sheet;

    public DisplaySongRenderer(RenderModel renderModel, DisplaySheet sheet) {
        super(renderModel);
        this.sheet = sheet;
    }

    public void setUp(Canvas canvas, Paint paint) {
        sheet.setUp(canvas, paint);
    }

    @Override
    public Sheet getSheet() {
        return sheet;
    }
}