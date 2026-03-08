package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiWrench: ImageVector
    get() {
        if (_SiWrench != null) {
            return _SiWrench!!
        }
        _SiWrench = ImageVector.Builder(
            name = "Duotone.SiWrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(21.764f, 7.035f)
                curveToRelative(-0.076f, -0.282f, -0.425f, -0.36f, -0.631f, -0.154f)
                lineToRelative(-3.082f, 3.08f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.697f, 0f)
                lineToRelative(-2.32f, -2.32f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.698f)
                lineToRelative(3.08f, -3.075f)
                curveToRelative(0.206f, -0.207f, 0.129f, -0.556f, -0.153f, -0.632f)
                arcToRelative(6.8f, 6.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.589f, 1.748f)
                curveToRelative(-2.04f, 2.04f, -2.502f, 5.044f, -1.416f, 7.536f)
                lineTo(3.7f, 16.768f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.396f)
                lineToRelative(0.14f, 0.14f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.393f, 0f)
                lineToRelative(5.263f, -5.258f)
                curveToRelative(2.49f, 1.074f, 5.484f, 0.606f, 7.518f, -1.43f)
                curveToRelative(1.787f, -1.783f, 2.362f, -4.307f, 1.75f, -6.581f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.764f, 7.035f)
                curveToRelative(-0.076f, -0.282f, -0.425f, -0.36f, -0.631f, -0.154f)
                lineToRelative(-3.082f, 3.08f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.697f, 0f)
                lineToRelative(-2.32f, -2.32f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.698f)
                lineToRelative(3.08f, -3.075f)
                curveToRelative(0.206f, -0.207f, 0.129f, -0.556f, -0.153f, -0.632f)
                arcToRelative(6.8f, 6.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.589f, 1.748f)
                curveToRelative(-2.04f, 2.04f, -2.502f, 5.044f, -1.416f, 7.536f)
                lineTo(3.7f, 16.768f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.396f)
                lineToRelative(0.14f, 0.14f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.393f, 0f)
                lineToRelative(5.263f, -5.258f)
                curveToRelative(2.49f, 1.074f, 5.484f, 0.606f, 7.518f, -1.43f)
                curveToRelative(1.787f, -1.783f, 2.362f, -4.307f, 1.75f, -6.581f)
            }
        }.build()

        return _SiWrench!!
    }

@Suppress("ObjectPropertyName")
private var _SiWrench: ImageVector? = null
