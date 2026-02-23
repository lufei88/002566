package com.github.catvod.spider.merge.h0;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge.h0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314C extends View {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f803short = {1710, 1725, 1725, 1743, 1742, 1737, 1721, -29472};
    public final Paint a;
    public final Paint b;
    public boolean c;
    public float d;
    public float e;
    public float f;
    public float g;
    public final int h;
    public boolean i;
    public final com.github.catvod.spider.merge.F.b j;
    public final /* synthetic */ C0315D k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0314C(C0315D c0315d, Activity activity) {
        super(activity);
        this.k = c0315d;
        this.c = false;
        this.i = false;
        this.j = new com.github.catvod.spider.merge.F.b(16, this);
        Paint paint = new Paint(1);
        this.a = paint;
        C0064.m9631(paint, C0000.m1044(C0040.m6584(m8655(), 0, 7, 1677)));
        C0064.m9606(C0023.m4567(this), C0047.m7782());
        C0009.m2114(C0023.m4567(this), 230);
        Paint paint2 = new Paint(1);
        this.b = paint2;
        C0064.m9631(paint2, -1);
        C0019.m4029(C0044.m7428(this), C0018.m3976(c0315d));
        Paint paintM7428 = C0044.m7428(this);
        Paint.Align alignM9323 = C0060.m9323();
        C0052.m8345(paintM7428, alignM9323);
        C0052.m8345(C0044.m7428(this), alignM9323);
        this.h = C0016.m3569(C0025.m4776(activity));
    }

    /* renamed from: ۟ۤۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m8655() {
        if (C0024.m4693() <= 0) {
            return f803short;
        }
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C0049.m8031(canvas, C0037.m6344(this) / 2, C0054.m8631(this) / 2, C0051.m8186(C0037.m6344(this), C0054.m8631(this)) / 2, C0023.m4567(this));
        Rect rect = new Rect();
        Paint paintM7428 = C0044.m7428(this);
        String strM8814 = C0055.m8814(m8655(), 7, 1, 2734);
        C0028.m5159(paintM7428, strM8814, 0, 1, rect);
        C0033.m5851(canvas, strM8814, C0037.m6344(this) / 2.0f, (C0054.m8631(this) / 2.0f) - ((C0054.m8645(C0044.m7428(this)) + C0047.m7851(C0044.m7428(this))) / 2.0f), C0044.m7428(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r58) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.h0.C0314C.onTouchEvent(android.view.MotionEvent):boolean");
    }
}