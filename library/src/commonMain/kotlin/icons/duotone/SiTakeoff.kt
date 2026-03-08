package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiTakeoff: ImageVector
    get() {
        if (_SiTakeoff != null) {
            return _SiTakeoff!!
        }
        _SiTakeoff = ImageVector.Builder(
            name = "Duotone.SiTakeoff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveToRelative(18.212f, 6.271f)
                lineToRelative(-3.668f, 2.241f)
                lineToRelative(-6.947f, -0.835f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.232f, 0.249f)
                lineToRelative(-1.113f, 0.649f)
                lineToRelative(5.262f, 2.16f)
                lineToRelative(-4.746f, 2.811f)
                lineToRelative(-1.404f, -0.2f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.513f, 0.175f)
                lineTo(2f, 14f)
                lineToRelative(3.47f, 2.044f)
                lineToRelative(6.174f, -1.32f)
                lineTo(22f, 8.687f)
                lineTo(20.972f, 6.97f)
                curveToRelative(-0.53f, -0.923f, -1.77f, -1.255f, -2.76f, -0.699f)
                quadToRelative(0.06f, 0f, 0f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(18.212f, 6.271f)
                lineToRelative(-3.668f, 2.241f)
                lineToRelative(-6.947f, -0.835f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.232f, 0.249f)
                lineToRelative(-1.113f, 0.649f)
                lineToRelative(5.262f, 2.16f)
                lineToRelative(-4.746f, 2.811f)
                lineToRelative(-1.404f, -0.2f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.513f, 0.175f)
                lineTo(2f, 14f)
                lineToRelative(3.47f, 2.044f)
                lineToRelative(6.174f, -1.32f)
                lineTo(22f, 8.687f)
                lineTo(20.972f, 6.97f)
                curveToRelative(-0.53f, -0.923f, -1.77f, -1.255f, -2.76f, -0.699f)
                moveToRelative(0f, 0f)
                quadToRelative(0.06f, 0f, 0f, 0f)
                moveTo(6f, 19f)
                horizontalLineToRelative(12f)
            }
        }.build()

        return _SiTakeoff!!
    }

@Suppress("ObjectPropertyName")
private var _SiTakeoff: ImageVector? = null
