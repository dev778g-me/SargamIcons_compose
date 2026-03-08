package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiAirplane: ImageVector
    get() {
        if (_SiAirplane != null) {
            return _SiAirplane!!
        }
        _SiAirplane = ImageVector.Builder(
            name = "Duotone.SiAirplane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(10.292f, 7.043f)
                curveToRelative(0f, -3.478f, 0.424f, -5.043f, 1.698f, -5.043f)
                curveToRelative(1.273f, 0f, 1.708f, 1.565f, 1.708f, 5.043f)
                verticalLineTo(8.74f)
                lineToRelative(6.238f, 3.957f)
                curveToRelative(0.425f, 0.304f, 0.57f, 0.804f, 0.552f, 1.304f)
                verticalLineToRelative(2f)
                lineToRelative(-6.532f, -2.62f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.548f, 0.345f)
                lineToRelative(-0.304f, 4.753f)
                lineToRelative(2.376f, 1.348f)
                curveToRelative(0.212f, 0.13f, 0.34f, 0.391f, 0.34f, 0.652f)
                lineTo(15.507f, 22f)
                lineToRelative(-3.517f, -1.174f)
                lineTo(8.483f, 22f)
                lineToRelative(-0.313f, -1.522f)
                curveToRelative(0f, -0.26f, 0.127f, -0.522f, 0.34f, -0.652f)
                lineToRelative(2.376f, -1.348f)
                lineToRelative(-0.304f, -4.753f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.548f, -0.345f)
                lineTo(3.502f, 16f)
                verticalLineToRelative(-2f)
                curveToRelative(-0.019f, -0.5f, 0.127f, -1f, 0.551f, -1.304f)
                lineToRelative(6.239f, -3.957f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.292f, 7.043f)
                curveToRelative(0f, -3.478f, 0.424f, -5.043f, 1.698f, -5.043f)
                curveToRelative(1.273f, 0f, 1.708f, 1.565f, 1.708f, 5.043f)
                verticalLineTo(8.74f)
                lineToRelative(6.238f, 3.957f)
                curveToRelative(0.425f, 0.304f, 0.57f, 0.804f, 0.552f, 1.304f)
                verticalLineToRelative(2f)
                lineToRelative(-6.532f, -2.62f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.548f, 0.345f)
                lineToRelative(-0.304f, 4.753f)
                lineToRelative(2.376f, 1.348f)
                curveToRelative(0.212f, 0.13f, 0.34f, 0.391f, 0.34f, 0.652f)
                lineTo(15.507f, 22f)
                lineToRelative(-3.517f, -1.174f)
                lineTo(8.483f, 22f)
                lineToRelative(-0.313f, -1.522f)
                curveToRelative(0f, -0.26f, 0.127f, -0.522f, 0.34f, -0.652f)
                lineToRelative(2.376f, -1.348f)
                lineToRelative(-0.304f, -4.753f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.548f, -0.345f)
                lineTo(3.502f, 16f)
                verticalLineToRelative(-2f)
                curveToRelative(-0.019f, -0.5f, 0.127f, -1f, 0.551f, -1.304f)
                lineToRelative(6.239f, -3.957f)
                close()
            }
        }.build()

        return _SiAirplane!!
    }

@Suppress("ObjectPropertyName")
private var _SiAirplane: ImageVector? = null
