package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiWidget: ImageVector
    get() {
        if (_SiWidget != null) {
            return _SiWidget!!
        }
        _SiWidget = ImageVector.Builder(
            name = "Duotone.SiWidget",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(9.2f, 14f)
                horizontalLineTo(3.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 0.8f)
                verticalLineToRelative(5.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, 0.8f)
                horizontalLineToRelative(5.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, -0.8f)
                verticalLineToRelative(-5.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -0.8f)
                moveTo(10.138f, 6.434f)
                lineTo(7.027f, 3.323f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.131f, 0f)
                lineTo(2.784f, 6.434f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.132f)
                lineToRelative(3.112f, 3.11f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.131f, 0f)
                lineToRelative(3.111f, -3.11f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.132f)
                moveTo(17.5f, 21f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -7f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.2f, 14f)
                horizontalLineTo(3.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 0.8f)
                verticalLineToRelative(5.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, 0.8f)
                horizontalLineToRelative(5.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, -0.8f)
                verticalLineToRelative(-5.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -0.8f)
                moveTo(10.138f, 6.434f)
                lineTo(7.027f, 3.323f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.131f, 0f)
                lineTo(2.784f, 6.434f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.132f)
                lineToRelative(3.112f, 3.11f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.131f, 0f)
                lineToRelative(3.111f, -3.11f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.132f)
                moveTo(17.5f, 21f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -7f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7f)
                moveTo(19.275f, 3.5f)
                curveToRelative(-0.795f, 0f, -1.481f, 0.466f, -1.826f, 1.144f)
                curveToRelative(-0.345f, -0.679f, -1.032f, -1.144f, -1.826f, -1.144f)
                curveToRelative(-1.14f, 0f, -2.063f, 0.955f, -2.063f, 2.132f)
                curveToRelative(0f, 1.176f, 0.707f, 2.254f, 1.62f, 3.139f)
                reflectiveCurveToRelative(2.269f, 1.729f, 2.269f, 1.729f)
                reflectiveCurveToRelative(1.312f, -0.83f, 2.269f, -1.729f)
                curveToRelative(1.021f, -0.959f, 1.62f, -1.96f, 1.62f, -3.14f)
                curveToRelative(0f, -1.179f, -0.923f, -2.131f, -2.063f, -2.131f)
            }
        }.build()

        return _SiWidget!!
    }

@Suppress("ObjectPropertyName")
private var _SiWidget: ImageVector? = null
