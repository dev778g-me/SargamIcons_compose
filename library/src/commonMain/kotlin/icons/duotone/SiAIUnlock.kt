package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiAIUnlock: ImageVector
    get() {
        if (_SiAIUnlock != null) {
            return _SiAIUnlock!!
        }
        _SiAIUnlock = ImageVector.Builder(
            name = "Duotone.SiAIUnlock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(4.6f, 10f)
                horizontalLineToRelative(10.8f)
                curveToRelative(0.88f, 0f, 1.6f, 0.72f, 1.6f, 1.6f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.32f, -1.08f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                curveTo(4.08f, 21f, 3f, 19.92f, 3f, 18.6f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.88f, 0.72f, -1.6f, 1.6f, -1.6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 10f)
                verticalLineTo(7f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(3f)
                moveTo(4.6f, 10f)
                horizontalLineToRelative(10.8f)
                curveToRelative(0.88f, 0f, 1.6f, 0.72f, 1.6f, 1.6f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.32f, -1.08f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                curveTo(4.08f, 21f, 3f, 19.92f, 3f, 18.6f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.88f, 0.72f, -1.6f, 1.6f, -1.6f)
                moveToRelative(5.206f, 3.276f)
                lineToRelative(-0.377f, 1.508f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.145f, 0.145f)
                lineToRelative(-1.508f, 0.377f)
                curveToRelative(-0.202f, 0.05f, -0.202f, 0.338f, 0f, 0.388f)
                lineToRelative(1.508f, 0.377f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.145f, 0.145f)
                lineToRelative(0.377f, 1.508f)
                curveToRelative(0.05f, 0.202f, 0.338f, 0.202f, 0.388f, 0f)
                lineToRelative(0.377f, -1.508f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.145f, -0.145f)
                lineToRelative(1.508f, -0.377f)
                curveToRelative(0.202f, -0.05f, 0.202f, -0.338f, 0f, -0.388f)
                lineToRelative(-1.508f, -0.377f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.145f, -0.145f)
                lineToRelative(-0.377f, -1.508f)
                curveToRelative(-0.05f, -0.202f, -0.338f, -0.202f, -0.388f, 0f)
            }
        }.build()

        return _SiAIUnlock!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIUnlock: ImageVector? = null
