package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiStrikethrough: ImageVector
    get() {
        if (_SiStrikethrough != null) {
            return _SiStrikethrough!!
        }
        _SiStrikethrough = ImageVector.Builder(
            name = "Duotone.SiStrikethrough",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.619f, 4.33f)
                arcTo(8.6f, 8.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.333f, 3f)
                curveToRelative(-2.38f, 0f, -4.571f, 1.947f, -4.571f, 3.894f)
                curveToRelative(0f, 2.043f, 1.524f, 3.658f, 4.571f, 4.94f)
                curveTo(15.857f, 13.306f, 17f, 14.588f, 17f, 16.774f)
                curveTo(17f, 19.527f, 14.143f, 21f, 11.667f, 21f)
                curveTo(10f, 21f, 8.38f, 20.525f, 7f, 19.575f)
                moveTo(4f, 12f)
                horizontalLineToRelative(16f)
            }
        }.build()

        return _SiStrikethrough!!
    }

@Suppress("ObjectPropertyName")
private var _SiStrikethrough: ImageVector? = null
