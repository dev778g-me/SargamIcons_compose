package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiStreetSign: ImageVector
    get() {
        if (_SiStreetSign != null) {
            return _SiStreetSign!!
        }
        _SiStreetSign = ImageVector.Builder(
            name = "Regular.SiStreetSign",
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
                moveTo(12f, 1f)
                verticalLineToRelative(2f)
                moveToRelative(0f, 15f)
                verticalLineToRelative(5f)
                moveToRelative(0f, -14f)
                verticalLineToRelative(3f)
                moveTo(6f, 9f)
                lineTo(2f, 6f)
                lineToRelative(4f, -3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(6f)
                close()
                moveTo(18f, 18f)
                lineTo(22f, 15f)
                lineTo(18f, 12f)
                lineTo(6f, 12f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()

        return _SiStreetSign!!
    }

@Suppress("ObjectPropertyName")
private var _SiStreetSign: ImageVector? = null
