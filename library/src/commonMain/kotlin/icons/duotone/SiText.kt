package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiText: ImageVector
    get() {
        if (_SiText != null) {
            return _SiText!!
        }
        _SiText = ImageVector.Builder(
            name = "Duotone.SiText",
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
                moveTo(8f, 21f)
                horizontalLineToRelative(8f)
                moveToRelative(-4f, 0f)
                verticalLineTo(3f)
                moveTo(4f, 7f)
                verticalLineTo(3f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(4f)
            }
        }.build()

        return _SiText!!
    }

@Suppress("ObjectPropertyName")
private var _SiText: ImageVector? = null
