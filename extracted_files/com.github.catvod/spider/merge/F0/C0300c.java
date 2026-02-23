package com.github.catvod.spider.merge.f0;

import android.R;
import android.app.Application;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import android.widget.TextView;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.x.C0015;

/* renamed from: com.github.catvod.spider.merge.f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300c extends TextView {
    public final Scroller a;
    public int b;

    public C0300c(Application application) {
        super(application, null, R.attr.textViewStyle);
        C0055.m8780(this);
        C0000.m1085(this, null);
        C0023.m4590(this, true);
        Scroller scroller = new Scroller(C0015.m3430(this), new LinearInterpolator());
        this.a = scroller;
        C0038.m6414(this, scroller);
    }

    @Override // android.widget.TextView, android.view.View
    public final void computeScroll() {
        super.computeScroll();
        Scroller scrollerM7840 = C0047.m7840(this);
        if (scrollerM7840 == null || !C0037.m6318(scrollerM7840)) {
            return;
        }
        if (scrollerM7840 != null) {
            C0017.m3697(scrollerM7840);
        }
        C0010.m2319(this, 8);
    }
}