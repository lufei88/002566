package com.github.catvod.spider.merge.a0;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.o0.C0056;

/* renamed from: com.github.catvod.spider.merge.a0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0248i implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0254o b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0248i(C0254o c0254o, int i) {
        this.a = i;
        this.b = c0254o;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (C0026.m4888(this)) {
            case 0:
                C0254o c0254oM6213 = C0036.m6213(this);
                C0056.m8936(c0254oM6213);
                C0025.m4829(new RunnableC0247h(c0254oM6213, 3));
                break;
            default:
                C0036.m6213(this).n = true;
                break;
        }
    }
}