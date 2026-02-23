package com.github.catvod.spider.merge.e0;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge.e0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286e extends FrameLayout {
    public final Path a;
    public final RectF b;
    public final int c;

    public C0286e(C0288g c0288g, Activity activity) {
        super(activity);
        this.a = new Path();
        this.b = new RectF();
        this.c = C0063.m9512(12 * C0016.m3554(C0007.m1852(C0002.m1335(C0062.m9446(c0288g)))));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int iM4375 = C0021.m4375(canvas);
        C0012.m2984(canvas, C0031.m5664(this));
        super.dispatchDraw(canvas);
        C0035.m6114(canvas, iM4375);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectFM7998 = C0049.m7998(this);
        C0008.m1985(rectFM7998, 0.0f, 0.0f, i, i2);
        Path pathM5664 = C0031.m5664(this);
        C0042.m7144(pathM5664);
        int iM1605 = C0005.m1605(this);
        C0015.m3412(pathM5664, rectFM7998, new float[]{iM1605, iM1605, iM1605, iM1605, 0.0f, 0.0f, 0.0f, 0.0f}, C0040.m6601());
    }
}