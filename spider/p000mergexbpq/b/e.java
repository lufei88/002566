package com.github.catvod.spider.p000mergexbpq.b;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.d.c;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements DialogInterface.OnCancelListener {
    public final /* synthetic */ p a;
    public final /* synthetic */ c b;

    public /* synthetic */ e(p pVar, c cVar) {
        this.a = pVar;
        this.b = cVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        p pVarM9301 = C0060.m9301(this);
        c cVarM1424 = C0003.m1424(this);
        C0047.m7777(pVarM9301);
        C0025.m4829(new c(pVarM9301, cVarM1424));
    }
}