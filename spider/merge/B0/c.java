package com.github.catvod.spider.merge.b0;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ c(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (C0039.m6490(this)) {
            case 0:
                C0007.m1876(C0057.m9003(), C0042.m7154(this));
                break;
            default:
                C0007.m1876(C0000.m1129(), C0042.m7154(this));
                break;
        }
    }
}