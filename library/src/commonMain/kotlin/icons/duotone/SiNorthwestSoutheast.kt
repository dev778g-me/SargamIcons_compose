package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiNorthwestSoutheast: ImageVector
    get() {
        if (_SiNorthwestSoutheast != null) {
            return _SiNorthwestSoutheast!!
        }
        _SiNorthwestSoutheast = ImageVector.Builder(
            name = "Duotone.SiNorthwestSoutheast",
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
                moveTo(18.364f, 18.364f)
                lineTo(5.636f, 5.636f)
                moveToRelative(12.728f, 12.728f)
                horizontalLineToRelative(-5.657f)
                moveToRelative(5.657f, 0f)
                verticalLineToRelative(-5.657f)
                moveTo(5.636f, 5.636f)
                verticalLineToRelative(5.657f)
                moveToRelative(0f, -5.657f)
                horizontalLineToRelative(5.657f)
            }
        }.build()

        return _SiNorthwestSoutheast!!
    }

@Suppress("ObjectPropertyName")
private var _SiNorthwestSoutheast: ImageVector? = null
