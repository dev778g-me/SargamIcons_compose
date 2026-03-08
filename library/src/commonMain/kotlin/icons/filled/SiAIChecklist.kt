package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAIChecklist: ImageVector
    get() {
        if (_SiAIChecklist != null) {
            return _SiAIChecklist!!
        }
        _SiAIChecklist = ImageVector.Builder(
            name = "Filled.SiAIChecklist",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                lineTo(12f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                close()
                moveTo(22f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                lineTo(12f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                close()
                moveTo(7.293f, 2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.414f, 1.414f)
                lineToRelative(-4f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, 0f)
                lineToRelative(-2f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.414f, -1.414f)
                lineTo(4f, 5.586f)
                close()
                moveTo(22f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                lineTo(12f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                close()
                moveTo(4.104f, 16.507f)
                curveToRelative(0.288f, -0.843f, 1.504f, -0.844f, 1.792f, 0f)
                lineToRelative(0.025f, 0.087f)
                lineToRelative(0.297f, 1.188f)
                lineToRelative(1.188f, 0.297f)
                curveToRelative(0.959f, 0.24f, 0.96f, 1.603f, 0f, 1.843f)
                lineToRelative(-1.188f, 0.296f)
                lineToRelative(-0.297f, 1.188f)
                curveToRelative(-0.24f, 0.959f, -1.602f, 0.959f, -1.842f, 0f)
                lineToRelative(-0.297f, -1.188f)
                lineToRelative(-1.188f, -0.296f)
                curveToRelative(-0.96f, -0.24f, -0.96f, -1.603f, 0f, -1.843f)
                lineToRelative(1.187f, -0.297f)
                lineToRelative(0.298f, -1.188f)
                close()
                moveTo(5f, 18.797f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.205f, 0.203f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.205f, 0.202f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.204f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 18.797f)
                moveToRelative(-0.896f, -9.29f)
                curveToRelative(0.298f, -0.871f, 1.585f, -0.842f, 1.817f, 0.087f)
                lineToRelative(0.297f, 1.188f)
                lineToRelative(1.188f, 0.297f)
                curveToRelative(0.96f, 0.24f, 0.96f, 1.603f, 0f, 1.842f)
                lineToRelative(-1.188f, 0.297f)
                lineToRelative(-0.297f, 1.188f)
                curveToRelative(-0.24f, 0.96f, -1.602f, 0.96f, -1.842f, 0f)
                lineToRelative(-0.297f, -1.188f)
                lineToRelative(-1.188f, -0.296f)
                curveToRelative(-0.96f, -0.24f, -0.96f, -1.603f, 0f, -1.843f)
                lineToRelative(1.188f, -0.297f)
                lineToRelative(0.297f, -1.188f)
                close()
                moveTo(5f, 11.797f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.204f, 0.203f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.204f, 0.203f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.203f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 11.797f)
            }
        }.build()

        return _SiAIChecklist!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIChecklist: ImageVector? = null
